package com.epam.automation;

import com.epam.automation.exception.UniversityHasNoFacultyException;

import static com.epam.automation.constants.Discipline.*;
import static com.epam.automation.constants.FacultyName.*;
import static com.epam.automation.service.StudentService.*;

public class Hogwarts {
    public static void main(String[] args) throws UniversityHasNoFacultyException {
        System.out.println(facultyList());
        System.out.println(getAverageRatingByStudentInAllDisciplines(facultyList(), 1));
        System.out.println(getAverageRatingByFacultyGroupDiscipline(facultyList(), SLYT, 401, ASTR));
        System.out.println(gerAverageRatingInDisciplineByAllFaculties(facultyList(), ASTR));
    }
}



