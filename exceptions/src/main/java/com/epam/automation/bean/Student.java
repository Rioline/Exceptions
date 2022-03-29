package com.epam.automation.bean;

import com.epam.automation.constants.Discipline;


import java.util.List;
import java.util.Map;

public class Student {
    private final int studentId;
    private final String studentName;
    private final Map<Discipline, List<Integer>> rating;

    public Student(int studentId, String studentName, Map<Discipline, List<Integer>> rating) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.rating = rating;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public Map<Discipline, List<Integer>> getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", rating=" + rating +
                '}';
    }
}




