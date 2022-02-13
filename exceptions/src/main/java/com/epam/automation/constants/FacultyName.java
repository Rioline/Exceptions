package com.epam.automation.constants;

public enum FacultyName {

    GRYF("Gryffindor"),
    HUFF("Hufflepuff"),
    RAVE("Ravenclaw"),
    SLYT("Slytherin");

    private final String fullName;

    FacultyName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

}
