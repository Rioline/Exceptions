package com.epam.automation.data;

import com.epam.automation.bean.Faculty;
import com.epam.automation.bean.Group;
import com.epam.automation.bean.Student;
import com.epam.automation.constants.Discipline;

import java.util.*;

import static com.epam.automation.constants.Discipline.*;
import static com.epam.automation.constants.FacultyName.*;


public class StudentData {

    public static List<Faculty> facultyList() {

        Map<Discipline, List<Integer>> ratingOne = new HashMap<>();
        ratingOne.put(ASTR, Arrays.asList(1, 2));
        ratingOne.put(DARK, Arrays.asList(4, 5, 6));
        ratingOne.put(HIST, Arrays.asList(7, 8, 9));
        ratingOne.put(POTI, Arrays.asList(7, 1, 2, 3));
        ratingOne.put(SPEL, Arrays.asList(4, 5, 6));
        ratingOne.put(TRAN, Arrays.asList(7, 8, 7, 9));
        Student studentOne = new Student(1, "Harry Potter", new HashMap<>(ratingOne));

        Map<Discipline, List<Integer>> ratingTwo = new HashMap<>();
        ratingTwo.put(ASTR, Arrays.asList(10, 10, 10));
        ratingTwo.put(DARK, Arrays.asList(10, 10, 10));
        ratingTwo.put(HIST, Arrays.asList(10, 10, 10));
        ratingTwo.put(POTI, Arrays.asList(10, 10, 10));
        ratingTwo.put(SPEL, Arrays.asList(10, 10, 10, 10));
        ratingTwo.put(TRAN, Arrays.asList(10, 10, 10, 10));
        Student studentTwo = new Student(2, "Hermione Granger", new HashMap<>(ratingTwo));

        Map<Discipline, List<Integer>> ratingThree = new HashMap<>();
        ratingThree.put(ASTR, Arrays.asList(1, 2));
        ratingThree.put(DARK, Arrays.asList(4, 5, 6));
        ratingThree.put(HIST, Arrays.asList(7, 8, 9));
        ratingThree.put(SPEL, Arrays.asList(2, 5, 8));
        ratingThree.put(TRAN, Arrays.asList(1, 5, 9));
        Student studentThree = new Student(3, "Neville Longbottom", new HashMap<>(ratingThree));

        Map<Discipline, List<Integer>> ratingFour = new HashMap<>();
        ratingFour.put(ASTR, Arrays.asList(6, 6, 3));
        ratingFour.put(DARK, Arrays.asList(4, 5, 6));
        ratingFour.put(HIST, Arrays.asList(7, 7, 8, 9));
        ratingFour.put(POTI, Arrays.asList(1, 4, 7));
        ratingFour.put(SPEL, Arrays.asList(7, 7, 2, 5, 8));
        ratingFour.put(TRAN, Arrays.asList(1, 5, 9));
        Student studentFour = new Student(4, "Ron Weasley", new HashMap<>(ratingFour));

        Map<Discipline, List<Integer>> ratingFive = new HashMap<>();
        ratingFive.put(ASTR, Arrays.asList(6, 6, 3));
        ratingFive.put(DARK, Arrays.asList(4, 5, 6));
        ratingFive.put(HIST, Arrays.asList(7, 7, 8, 9));
        ratingFive.put(POTI, Arrays.asList(1, 4, 7));
        ratingFive.put(SPEL, Arrays.asList(7, 7, 2, 5, 8));
        ratingFive.put(TRAN, Arrays.asList(1, 5, 9));
        Student studentFive = new Student(5, "Cedric Diggory", new HashMap<>(ratingFive));

        Map<Discipline, List<Integer>> ratingSix = new HashMap<>();
        ratingSix.put(ASTR, Arrays.asList(6, 6, 3));
        ratingSix.put(DARK, Arrays.asList(4, 5, 6));
        ratingSix.put(HIST, Arrays.asList(7, 7, 8, 9));
        ratingSix.put(POTI, Arrays.asList(1, 4, 7));
        ratingSix.put(SPEL, Arrays.asList(7, 7, 2, 5, 8));
        ratingSix.put(TRAN, Arrays.asList(1, 5, 9));
        Student studentSix = new Student(6, "Natsumi Suzuki", new HashMap<>(ratingSix));

        Map<Discipline, List<Integer>> ratingSeven = new HashMap<>();
        ratingSeven.put(ASTR, Arrays.asList(6, 6, 3));
        ratingSeven.put(DARK, Arrays.asList(4, 5, 6));
        ratingSeven.put(HIST, Arrays.asList(7, 7, 8, 9));
        ratingSeven.put(POTI, Arrays.asList(1, 4, 7));
        ratingSeven.put(SPEL, Arrays.asList(7, 7, 2, 5, 8));
        ratingSeven.put(TRAN, Arrays.asList(1, 5, 9));
        Student studentSeven = new Student(7, "Natsumi Suzuki", new HashMap<>(ratingSeven));

        Map<Discipline, List<Integer>> ratingEight = new HashMap<>();
        ratingEight.put(ASTR, Arrays.asList(6, 6, 3));
        ratingEight.put(DARK, Arrays.asList(4, 5, 6));
        ratingEight.put(HIST, Arrays.asList(7, 7, 8, 9));
        ratingEight.put(POTI, Arrays.asList(1, 4, 7));
        ratingEight.put(SPEL, Arrays.asList(7, 7, 2, 5, 8));
        ratingEight.put(TRAN, Arrays.asList(1, 5, 9));
        Student studentEight = new Student(8, "Cho Chang", new HashMap<>(ratingEight));

        Map<Discipline, List<Integer>> ratingNine = new HashMap<>();
        ratingNine.put(ASTR, Arrays.asList(6, 6, 3));
        ratingNine.put(DARK, Arrays.asList(4, 5, 6));
        ratingNine.put(HIST, Arrays.asList(7, 7, 8, 9));
        ratingNine.put(POTI, Arrays.asList(1, 4, 7));
        ratingNine.put(SPEL, Arrays.asList(7, 7, 2, 5, 8));
        ratingNine.put(TRAN, Arrays.asList(1, 5, 9));
        Student studentNine = new Student(9, "Vincent Crabbe", new HashMap<>(ratingNine));

        Map<Discipline, List<Integer>> ratingTen = new HashMap<>();
        ratingTen.put(ASTR, Arrays.asList(3, 6, 3));
        ratingTen.put(DARK, Arrays.asList(3, 5, 6));
        ratingTen.put(HIST, Arrays.asList(7, 7, 8, 0));
        ratingTen.put(POTI, Arrays.asList(1, 4, 3));
        ratingTen.put(SPEL, Arrays.asList(7, 7, 2, 5, 8));
        ratingTen.put(TRAN, Arrays.asList(1, 5, 0));
        Student studentTen = new Student(10, "Draco Malfoy", new HashMap<>(ratingTen));

        Group groupOne = new Group(101, Arrays.asList(studentOne, studentTwo));
        Group groupTwo = new Group(102, Arrays.asList(studentThree, studentFour));
        Group groupThree = new Group(201, Collections.singletonList(studentFive));
        Group groupFour = new Group(202, Collections.singletonList(studentSix));
        Group groupFive = new Group(301, Collections.singletonList(studentSeven));
        Group groupSix = new Group(302, Collections.singletonList(studentEight));
        Group groupSeven = new Group(401, Arrays.asList(studentNine, studentTen));


        Faculty facultyOne = new Faculty(GRYF, Arrays.asList(groupOne, groupTwo));
        Faculty facultyTwo = new Faculty(HUFF, Arrays.asList(groupThree, groupFour));
        Faculty facultyThree = new Faculty(RAVE, Arrays.asList(groupFive, groupSix));
        Faculty facultyFour = new Faculty(SLYT, Collections.singletonList(groupSeven));

        return Arrays.asList(facultyOne, facultyTwo, facultyThree, facultyFour);
    }

}

