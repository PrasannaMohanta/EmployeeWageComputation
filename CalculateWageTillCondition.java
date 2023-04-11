package com.EmployeeWageComputation;
/**
 *
 * @author Prasanna
 *
 */

public class CalculateWageTillCondition {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
         *
         */
        for (int i=1;i<=30;i++) {
            int totalWorkingHour;
            int totalDays;
            if ( totalWorkingHour>=100 && totalDays>=20) {
                System.out.println("Employee is eligible");
            }
            else {
                int workingHour = 8;
                int partTimeWorkingHour=4;
                int wagePerHour=20;
                double isPresent = Math.random()*3;
                if (isPresent>=2) {
                    int totalSalary=workingHour*wagePerHour;
                    System.out.println("employee is present ");
                    System.out.println("salary : "+ totalSalary);
                }
                else if (isPresent>=1 && isPresent<2){
                    int totalSalary=partTimeWorkingHour*wagePerHour;
                    System.out.println("employee is partTime ");
                    System.out.println("salary : "+ totalSalary);
                }
                else {
                    int totalSalary=0;
                    System.out.println("employee is absent ");
                    System.out.println("salary : "+ totalSalary);
                }
            }
        }

    }
}

