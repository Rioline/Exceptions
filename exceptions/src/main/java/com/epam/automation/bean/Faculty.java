package com.epam.automation.bean;

import com.epam.automation.constants.FacultyName;
import java.util.List;

public class Faculty {

    FacultyName facultyName;
    List<Group> groupList;

    public Faculty(FacultyName facultyName, List<Group> groupList) {
        this.facultyName = facultyName;
        this.groupList = groupList;
    }

    public FacultyName getFacultyName() {
        return facultyName;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyName=" + facultyName +
                ", groupList=" + groupList +
                '}';
    }

}
