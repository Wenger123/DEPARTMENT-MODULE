package com.francis.staff_Services;

import com.francis.module.NonAcademicStaff;

public class NonAcademicServices implements NonAcademicStaffServices {

  @Override
  public void registration(String registryName) {
   NonAcademicStaff nonAcademicStaff1 = new NonAcademicStaff("Mary","MY 3","Female","mary@gmail.com",
                                                             "registry office", 70_000);
   if (registryName.equals(nonAcademicStaff1.getName())){
    System.out.println("You are responsible for student registration");
   }
   else
    System.out.println("You are not the registry");
  }

  @Override
  public void cleaning(String cleanerName) {
   NonAcademicStaff nonAcademicStaff2 = new NonAcademicStaff("Esther","ET 7","Female","esther@gmail.com",
           "cleaner office", 30_000);
   if (cleanerName.equals(nonAcademicStaff2.getName())){
    System.out.println("You are responsible for cleaning the department and it's environment");
   }
   else
    System.out.println("You are not the cleaner");

  }

  @Override
  public void security(String securityName) {
   NonAcademicStaff nonAcademicStaff3 = new NonAcademicStaff("Anthony","AT 5","Male","anthony@gmail.com",
           "cleaner office", 40_000);
   if (securityName.equals(nonAcademicStaff3.getName())){
    System.out.println("You are responsible for securing the department and it's environment");
   }
   else
    System.out.println("You are not the security");

  }
 }
