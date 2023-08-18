package com.francis.staff_Services;


import com.francis.module.Student;
import com.francis.module.Teacher;

interface PrincipalStaffServices {
    void expelStudent(Student studentName);
    void admitStudent(int age);
    void employStaff(String applicantName);
    void promoteStaff(Teacher teacher);
    void terminateStaff(Teacher teacherName);
    void upgradeStaffSalary(Teacher teacherName);
}
