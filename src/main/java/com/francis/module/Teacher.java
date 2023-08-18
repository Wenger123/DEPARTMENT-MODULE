package com.francis.module;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Staff{
    private List<Student> studentList;

    public Teacher(String name, String id, String sex, String email, String officeName, double salary) {
        super(name, id, sex, email, officeName, salary);
        this.studentList = new ArrayList<>();
    }
    public void addStudent(Student studentName){
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
        return "Teacher{" +
                "studentList=" + studentList +
                '}';
    }
}
