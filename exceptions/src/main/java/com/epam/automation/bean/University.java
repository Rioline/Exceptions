package com.epam.automation.bean;

import java.util.List;

public class University {

    private final static String nameOfUniversity = "Hogwarts";
    private final List<Faculty> facultyList;

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public University(List<Faculty> facultyList) {
        this.facultyList = facultyList;
    }

    public List<Faculty> getFacultyList() {
        return facultyList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        University that = (University) o;

        return facultyList.equals(that.facultyList);
    }

    @Override
    public int hashCode() {
        return facultyList.hashCode();
    }

    @Override
    public String toString() {
        return "University{" +
                "nameOfUniversity='" + nameOfUniversity + '\'' +
                ", facultyList=" + facultyList +
                '}';
    }
}
