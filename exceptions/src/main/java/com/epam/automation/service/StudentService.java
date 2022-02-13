package com.epam.automation.service;

import com.epam.automation.bean.Faculty;
import com.epam.automation.bean.Group;
import com.epam.automation.bean.Student;
import com.epam.automation.constants.Discipline;
import com.epam.automation.constants.FacultyName;
import com.epam.automation.data.StudentData;
import com.epam.automation.exception.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

import java.util.*;

public class StudentService {

    public static List<Faculty> facultyList() throws UniversityHasNoFacultyException {
//----->Отсутствие факультетов в университете
        if (StudentData.facultyList() == null) {
            throw new UniversityHasNoFacultyException("University can't be null!");
        } else if (StudentData.facultyList()
                .isEmpty()) {
            throw new UniversityHasNoFacultyException("University has no one faculty!");
//----->Отсутствие групп на факультете
        } else if (StudentData.facultyList()
                .stream()
                .anyMatch(x -> x.getGroupList() == null)) {
            throw new FacultyHasNoGroupException("Faculty can't be with null group!");
        } else if (StudentData.facultyList()
                .stream()
                .anyMatch(x -> x.getGroupList()
                        .isEmpty())) {
            throw new FacultyHasNoGroupException("Faculty has no group!");
//----->Отсутствие студентов в группе
        } else if (StudentData.facultyList()
                .stream()
                .anyMatch(x -> x.getGroupList()
                        .stream()
                        .anyMatch(y -> y.getStudentList() == null))) {
            throw new GroupHasNoStudentException("Student Can't be a null!!");
        } else if (StudentData.facultyList()
                .stream()
                .anyMatch(x -> x.getGroupList()
                        .stream()
                        .anyMatch(y -> y.getStudentList()
                                .isEmpty()))) {
            throw new GroupHasNoStudentException("Group has no student!");
//----->Отсутствие предметов у студента
        } else if (StudentData.facultyList()
                .stream()
                .anyMatch(x -> x.getGroupList()
                        .stream()
                        .anyMatch(y -> y.getStudentList()
                                .stream()
                                .anyMatch(z -> z.getRating()
                                        == null)))) {
            throw new StudentHasNoDisciplineException("Discipline cant be null!");
        } else if (StudentData.facultyList()
                .stream()
                .anyMatch(x -> x.getGroupList()
                        .stream()
                        .anyMatch(y -> y.getStudentList()
                                .stream()
                                .anyMatch(z -> z.getRating()
                                        .isEmpty())))) {
            throw new StudentHasNoDisciplineException("Student has no discipline");
//----->Оценка ниже 0 или выше 10
        } else if (StudentData.facultyList()
                .stream()
                .anyMatch(a -> a.getGroupList()
                        .stream()
                        .anyMatch(y -> y.getStudentList()
                                .stream()
                                .anyMatch(z -> z.getRating()
                                        .entrySet()
                                        .stream()
                                        .anyMatch(x -> x.getValue()
                                                .stream()
                                                .anyMatch(h -> h < 0 || h > 10)))))) {
            throw new IncorrectRatingException("Rating must be from 0 till 10!");
        } else {
            return StudentData.facultyList();
        }
    }

    public static double getAverageRatingByStudentInAllDisciplines
            (List<Faculty> faculties, int id)
            throws UniversityHasNoFacultyException {

        double countOfScores = 0;
        double totalRatingInAllDisciplines = 0;

        for (Faculty faculty : facultyList()) {
            for (Group group : faculty.getGroupList()) {
                for (Student student : group.getStudentList()) {
                    if (student.getStudentId() == id) {
                        Map<Discipline, List<Integer>> rating = student.getRating();  //key + value
                        Collection<List<Integer>> allScores = rating.values();        //value as Coll<List<Integer>>
                        for (List<Integer> integer : rating.values()) {               //all values
                            totalRatingInAllDisciplines += integer.stream()
                                    .filter(x -> x >= 0 && x <= 10)
                                    .reduce(0, Integer::sum)
                                    .doubleValue();
                            countOfScores += integer.size();
                        }
                        System.out.println("-------------------------------------------------------------------");
                        System.out.println("This method calculate average rating by student in all disciplines!");
                        System.out.println("Sum of all scores = " + totalRatingInAllDisciplines);
                        System.out.println("Count of scores = " + countOfScores);
                        System.out.print("Average ratting = ");
                    }
                }
            }
        }
        return BigDecimal.valueOf(totalRatingInAllDisciplines / countOfScores)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
    }

    public static double getAverageRatingByFacultyGroupDiscipline
            (List<Faculty> faculties, FacultyName facultyName, int groupId, Discipline discipline)
            throws UniversityHasNoFacultyException {

        double totalRatingInAllDisciplines = 0;
        double countOfScores = 0;

        for (Faculty faculty : facultyList()) {
            if (faculty.getFacultyName() == facultyName) {
                for (Group group : faculty.getGroupList()) {
                    if (group.getGroupId() == groupId) {
                        for (Student student : group.getStudentList()) {

                            Map<Discipline, List<Integer>> rating = student.getRating();

                            Map.Entry<Discipline, List<Integer>> sortedByDiscipline = rating.entrySet()
                                    .stream()
                                    .filter(x -> x.getKey() == discipline)
                                    .findFirst()
                                    .orElseThrow(() -> new StudentHasNoDisciplineException("There is no discipline!"));

                            Collection<List<Integer>> allScoresInDiscipline = Collections
                                    .singleton(sortedByDiscipline.getValue());

                            for (List<Integer> integer : allScoresInDiscipline) {
                                totalRatingInAllDisciplines += integer.stream()
                                        .filter(x -> x >= 0 && x <= 10)
                                        .reduce(0, Integer::sum)
                                        .doubleValue();
                                countOfScores += integer.size();
                            }
                        }
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println("This method calculate average rating by discipline at this faculty and in this group!");
                        System.out.println("Sum of scores in this discipline = " + totalRatingInAllDisciplines);
                        System.out.println("Count of scores = " + countOfScores);
                        System.out.print("Average rating by this discipline in this faculty and this group = ");
                    }
                }
            }
        }
        return BigDecimal.valueOf(totalRatingInAllDisciplines / countOfScores)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
    }

    public static double gerAverageRatingInDisciplineByAllFaculties
            (List<Faculty> faculties, Discipline discipline)
            throws UniversityHasNoFacultyException {

        double totalRatingInAllDisciplines = 0;
        double countOfScores = 0;

        for (Faculty faculty : facultyList()) {
            for (Group group : faculty.getGroupList()) {
                for (Student student : group.getStudentList()) {
                    Map<Discipline, List<Integer>> rating = student.getRating();
                    Map.Entry<Discipline, List<Integer>> sortedByDiscipline = rating.entrySet()
                            .stream()
                            .filter(x -> x.getKey() == discipline)
                            .findFirst()
                            .orElseThrow(() -> new StudentHasNoDisciplineException("There is no discipline!"));
                    Collection<List<Integer>> allScoresInDiscipline = Collections
                            .singleton(sortedByDiscipline.getValue());
                    for (List<Integer> integer : allScoresInDiscipline) {
                        totalRatingInAllDisciplines += integer.stream()
                                .filter(x -> x >= 0 && x <= 10)
                                .reduce(0, Integer::sum)
                                .doubleValue();
                        countOfScores += integer.size();
                    }
                }
            }
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("This method calculate average rating by discipline in all university!");
        System.out.println("Sum of scores in this discipline = " + totalRatingInAllDisciplines);
        System.out.println("Count of scores = " + countOfScores);
        System.out.print("Average rating by this discipline in all university = ");
        return BigDecimal.valueOf(totalRatingInAllDisciplines / countOfScores)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
    }

}





