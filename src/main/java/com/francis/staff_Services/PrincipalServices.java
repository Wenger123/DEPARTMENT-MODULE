package com.francis.staff_Services;
import com.francis.module.*;

public class PrincipalServices implements PrincipalStaffServices {
   private final int strike = 3;
    @Override
    public void expelStudent(Student studentName) {
       if (studentName.equals(strike)){
           System.out.println("You are expelled because the strike is greater than "+ strike);
       }else
           System.out.println("You have been given a 'STRIKE' because the strike is less than "+ strike);
    }
    @Override
    public void admitStudent(int studentAge) {
       if (studentAge >= 10 && studentAge <= 15){
           System.out.println("You are admitted because you are in the age range of our choice");
       }
       else
           System.out.println("Sorry, You are not qualified");
    }
     Applicant applicant = new Applicant("Francis","male","no 5", "english", ApplicantType.STUDENT);
    @Override
    public void employStaff(String applicantName) {
        if (applicantName.equals(applicant.getName())){
            System.out.println("YOU are Employed");
        }
        else
            System.out.println("You are not qualify");
    }

    @Override
    public void promoteStaff(Teacher teacherName) {
         String exceptional = "Promoted";
        if (teacherName.equals(exceptional)){
            System.out.println("You are " + exceptional +" because You are an exceptional Staff");
        }
        else
            System.out.println("You are not qualified");
    }

    @Override
    public void terminateStaff(Teacher teacherName) {
        if (teacherName.equals(strike)){
            System.out.println("We have terminated your contract with us because, Your strike is greater than " +
                               strike + " Thank you for the services you rendered");
        }
        else
            System.out.println("You have been given Strike because, You number of strike less than " + strike);
    }

    @Override
    public void upgradeStaffSalary(Teacher teacherName) {
        int year = 3;
        if (teacherName.equals(year)){
            System.out.println("Your salary have been upgraded, because you are here more than " + year + " Years");
        }
        else
            System.out.println("You are not qualified");
    }
}
