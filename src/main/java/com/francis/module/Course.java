package com.francis.module;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private int courseCode;
    private int coursePassMark;
    private List <Teacher> courseTeachersList;

    public Course(String courseName, int courseCode, int coursePassMark) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.coursePassMark = coursePassMark;
        this.courseTeachersList = new ArrayList<>();
    }
    public void addTeacher(Teacher teacher){
        courseTeachersList.add(teacher);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public int getCoursePassMark() {
        return coursePassMark;
    }

    public void setCoursePassMark(int coursePassMark) {
        this.coursePassMark = coursePassMark;
    }

    public List<Teacher> getCourseTeachersList() {
        return courseTeachersList;
    }

    public void setCourseTeachersList(List<Teacher> courseTeachersList) {
        this.courseTeachersList = courseTeachersList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseCode='" + courseCode + '\'' +
                ", coursePassMark=" + coursePassMark +
                ", courseTeachersList=" + courseTeachersList +
                '}';
    }
}
