package com.francis;

import com.francis.module.*;
import com.francis.staff_Services.NonAcademicServices;
import com.francis.staff_Services.PrincipalServices;
import com.francis.staff_Services.TeacherServices;

public class Main {
    public static void main(String[] args) {
        Applicant applicant = new Applicant("Francis","male","no 5", "englsh", ApplicantType.STUDENT);
        PrincipalServices principalServices = new PrincipalServices();
        principalServices.employStaff(applicant.getName());
        Principal principal = new Principal("Mrs Agnes", "M.A 1", "female","agnes@gmail.com","principal office", 200_000);

        Teacher teacher = new Teacher("Mr Mark","d23","Male","mark@gmail.com","staff 2", 150_000);
        TeacherServices teacherServices = new TeacherServices();
        teacherServices.teachCourse(teacher.getName());

        NonAcademicStaff nonAcademicStaff3 = new NonAcademicStaff("Anthony","AT 5","Male","anthony@gmail.com",
                "cleaner office", 40_000);
        NonAcademicServices nonAcademicServices = new NonAcademicServices();
        nonAcademicServices.security(nonAcademicStaff3.getName());

        Student student = new Student("John",11,"Male","NO 10 lagos street", "Jh 10", "Science class", 50, "john@gmail.com",150_000,45_0000);

    }
}
