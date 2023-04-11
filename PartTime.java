package com.EmployeeWageComputation;
public class PartTime {

    public static void main(String[] args) {
        /*
         * Check Employee is Present or Absent - Use ((RANDOM)) for Attendance Check
         * daily salary calculating
         */
        int workingHour=8;
        int partTimeWorkingHour=4;
        int wagePerHour=20;
        /*
         * checking employee is present or absent or part time
         */
        double isPresent = Math.random()*3;
        /*
         * calculating the salary for present employee
         */
        if (isPresent>=2) {
            int totalSalary=workingHour*wagePerHour;
            System.out.println("employee is present ");
            System.out.println("salary : "+ totalSalary);
        }
        /*
         * calculating the salary for part time employee
         */
        else if (isPresent>=1 && isPresent<2){
            int totalSalary=partTimeWorkingHour*wagePerHour;
            System.out.println("employee is partTime ");
            System.out.println("salary : "+ totalSalary);
        }
        /*
         * calculating the salary for absent employee
         */
        else {
            int totalSalary=0;
            System.out.println("employee is absent ");
            System.out.println("salary : "+ totalSalary);
        }
    }

}

