package com.epam.automation;

import com.epam.automation.exception.UniversityHasNoFacultyException;

import static com.epam.automation.constants.Discipline.*;
import static com.epam.automation.constants.FacultyName.*;
import static com.epam.automation.service.StudentService.*;

public class Hogwarts {
    public static void main(String[] args) throws UniversityHasNoFacultyException {
        System.out.println(getAndCheckFacultyList());
        System.out.println(getAverageRatingByStudentInAllDisciplines(getAndCheckFacultyList(), 1));
        System.out.println(getAverageRatingByFacultyGroupDiscipline(getAndCheckFacultyList(), SLYT, 401, ASTR));
        System.out.println(gerAverageRatingInDisciplineByAllFaculties(getAndCheckFacultyList(), ASTR));
    }
}



