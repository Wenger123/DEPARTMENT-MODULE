package com.francis.module;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

abstract class Staff {
    private String name;
    private String id;
    private String sex;
    private String email;
    private String officeName;
    private double salary;
    private List<Student> studentList;
    public Staff(String name, String id, String sex, String email, String officeName, double salary) {
        this.name = name;
        this.id = id;
        this.sex = sex;
        this.email = email;
        this.officeName = officeName;
        this.salary = salary;
        this.studentList = new ArrayList<>();

    }
    NumberFormat salaryFormatter = NumberFormat.getCurrencyInstance();
    String totalSalary = salaryFormatter.format(salary);
    public void addStudent(Student studentName){
        studentList.add(studentName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", officeName='" + officeName + '\'' +
                ", salary=" + salary +
                ", studentList=" + studentList +
                '}';
    }
}
