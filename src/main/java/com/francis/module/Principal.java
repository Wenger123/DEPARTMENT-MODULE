package com.francis.module;

import java.util.ArrayList;
import java.util.List;

public class Principal extends Staff {
    private List <Teacher> teacherList;
    private List <NonAcademicStaff> nonAcademicStaffList;
    private List <Student> studentList;
    public Principal(String name, String id, String sex, String email, String officeName, double salary) {
        super(name, id, sex, email, officeName, salary);
        this.teacherList = new ArrayList<>();
        this.nonAcademicStaffList = new ArrayList<>();
        this.studentList = new ArrayList<>();
    }
    public void addTeacher(Teacher teacherName){
        teacherList.add(teacherName);
    }
    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
    public void addNonAcademicStaff(NonAcademicStaff nonAcademicStaffName){
        nonAcademicStaffList.add(nonAcademicStaffName);
    }

    public List<NonAcademicStaff> getNonAcademicStaffList() {
        return nonAcademicStaffList;
    }

    public void setNonAcademicStaffList(List<NonAcademicStaff> nonAcademicStaffList) {
        this.nonAcademicStaffList = nonAcademicStaffList;
    }
    public void addStudent(Student studentName) {
        studentList.add(studentName);
    }

    @Override
    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "teacherList=" + teacherList +
                ", nonAcademicStaffList=" + nonAcademicStaffList +
                '}';
    }
}
