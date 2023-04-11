package com.EmployeeWageComputation;
/**
 *
 * @author Prasanna
 *
 */

public class EmployeeWageForMonth {
    /**
     *
     * @param args
     */

    public static void main(String[] args) {
        /*
         * for loop for a month
         */
        for (int i=1;i<=30;i++) {
            int workingHour=8;
            int partTimeWorkingHour=4;
            int wagePerHour=20;
            /*
             * use random for check employee is present ,part time or absent
             */
            double isPresent = Math.random()*3;
            if (isPresent>=2) {
                /*
                 * calculate the employee wage for present
                 */
                int totalSalary=workingHour*wagePerHour;
                System.out.println("employee is present ");
                System.out.println("salary : "+ totalSalary);
            }
            else if (isPresent>=1 && isPresent<2){
                /*
                 * calculate the employee wage for part time
                 */
                int totalSalary=partTimeWorkingHour*wagePerHour;
                System.out.println("employee is partTime ");
                System.out.println("salary : "+ totalSalary);
            }
            else {
                /*
                 * calculate the employee wage for absent
                 */
                int totalSalary=0;
                System.out.println("employee is absent ");
                System.out.println("salary : "+ totalSalary);
            }
        }

    }

}

