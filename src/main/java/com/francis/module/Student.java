package com.francis.module;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private String sex;
    private String address;
    private String id;
    private String classRoom;
    private int grade;
    private String email;
    private final String uniform = "BLUE";
    private int schoolFees;
    private int otherFees;
    private List <Course> studentCourseList;
    private  LocalTime lectureTime;

    public Student(String name, int age, String sex, String address, String id, String classRoom,
                   int grade, String email, int schoolFees, int otherFees) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.classRoom = classRoom;
        this.grade = grade;
        this.email = email;
        this.age = age;
        this.sex = sex;
        this.schoolFees = schoolFees;
        this.otherFees = otherFees;
        this.studentCourseList = new ArrayList<>();
        this.lectureTime = LocalTime.now();
    }
    public void addStudentCourse(Course course){
        studentCourseList.add(course);
    }
    public void takeCourse(Course courseName){
        if (studentCourseList.contains(courseName)){
            System.out.println("You are eligible to take "+ courseName +" course");
        }
        else
            System.out.println("You are not eligible to take "+ courseName +" course");
    }
    public void attendClass(LocalTime studentTime) {
        if (studentTime.isBefore(lectureTime)) {
            System.out.println("You have access to class, because you are here before " + lectureTime);
        } else
            System.out.println("Access denied, because you are here after " + lectureTime);
    }
    public void accessToLibrary(int studentSchoolFees){
        if (studentSchoolFees == schoolFees){
            System.out.println("You have access to library because you paid school fees");
        }
        else
            System.out.println("You don't have access to library because you have not paid school fees");
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getSex() {
        return sex;
    }
    public String getAddress() {
        return address;
    }
    public String getId() {
        return id;
    }
    public String getClassRoom() {
        return classRoom;
    }
    public int getGrade() {
        return grade;
    }
    public String getEmail() {
        return email;
    }
    public String getUniform() {
        return uniform;
    }
    public int getSchoolFees() {
        return schoolFees;
    }

    public int getOtherFees() {
        return otherFees;
    }
    public List<Course> getStudentCourseList() {
        return studentCourseList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", id='" + id + '\'' +
                ", classRoom='" + classRoom + '\'' +
                ", grade=" + grade +
                ", email='" + email + '\'' +
                ", uniform='" + uniform + '\'' +
                ", schoolFees=" + schoolFees +
                ", otherFees=" + otherFees +
                ", studentCourseList=" + studentCourseList +
                ", lectureTime=" + lectureTime +
                '}';
    }
}
