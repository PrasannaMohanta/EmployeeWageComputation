package com.EmployeeWageComputation;
/**
 *
 * @author Prasanna
 *
 */

public class DailyEmployeeWageCalculate {
    /**
     *
     * @param argsSS
     */
    public static void main(String[] args) {
        /*
         * Check Employee is Present or Absent - Use ((RANDOM)) for Attendance Check
         * daily salary calculating
         */
        int workingHour=8;
        int wagePerHour=20;
        double isPresent = Math.random();
        if (isPresent<=0.5) {
            /*
             * calculating wage for present	employee
             */
            int totalSalary=workingHour*wagePerHour;
            System.out.println("employee is present ");
            System.out.println("salary : "+ totalSalary);
        }
        else {
            /*
             * calculating wage for absent employee
             */
            int totalSalary=0;
            System.out.println("employee is absent ");
            System.out.println("salary : "+ totalSalary);
        }
    }

}

