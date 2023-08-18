package com.francis.module;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    public String classRoomName;
    private final int studentSize = 40;
    private final int chair = 41;
    private final int board = 1;
    private final int table = 41;
    private List <Student> classRoomList;

    public ClassRoom(String classRoomName) {
        this.classRoomName = classRoomName;
        this.classRoomList = new ArrayList<>();
    }

    public void addStudent(Student studentName){
        classRoomList.add(studentName);
    }

    public String getClassName() {
        return classRoomName;
    }

    public void setClassRoomName(String classRoomName) {
        this.classRoomName = classRoomName;
    }

    public List<Student> getClassList() {
        return classRoomList;
    }

    public void setClassRoomList(List<Student> classRoomList) {
        this.classRoomList = classRoomList;
    }

    @Override
    public String toString() {
        return "Class{" +
                "className='" + classRoomName+ '\'' +
                ", studentSize=" + studentSize +
                ", chair=" + chair +
                ", board=" + board +
                ", table=" + table +
                ", classList=" + classRoomList +
                '}';
    }
}
