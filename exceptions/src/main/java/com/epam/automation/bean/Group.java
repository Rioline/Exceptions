package com.epam.automation.bean;

import java.util.List;

public class Group {

    private final int groupId;
    private final List<Student> studentList;


    public Group(int groupId, List<Student> studentList) {
        this.groupId = groupId;
        this.studentList = studentList;
    }

    public int getGroupId() {
        return groupId;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", studentList=" + studentList +
                '}';
    }
}
