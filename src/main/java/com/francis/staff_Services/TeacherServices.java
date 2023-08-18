package com.francis.staff_Services;

import com.francis.module.Course;
import com.francis.module.Student;
import com.francis.module.Teacher;
public class TeacherServices implements TeacherStaffServices {
     @Override
     public void teachCourse(String teacherName) {
         Teacher teacher = new Teacher("Mr Mark","d23","Male","mark@gmail.com","staff 2", 150_000);
         Course course = new Course("Mathematics",101, 40);
           if (teacherName.equals(teacher.getName())){
               System.out.println("You are to teach this course because, Your name is in the course teachers list ");
           }
           else
               System.out.println("You are not eligible to teach this course");
     }

     @Override
     public void giveGrade(Student studentName) {
         Teacher teacher = new Teacher("teacher Name","teacher id","teacher sex","teacher email",
                           "teacher office name", 0.00);
         if (teacher.getStudentList().contains(studentName)){
             System.out.println("You can now give the student grade because, the student name is in the student list");
         }
         else
             System.out.println("You are not part of our Student");
     }
 }
