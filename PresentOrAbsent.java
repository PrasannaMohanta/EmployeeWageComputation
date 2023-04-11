package com.EmployeeWageComputation;
/**
 *
 * @author Prasanna
 *
 */

public class PresentOrAbsent {
    /**
     *
     * @param args
     */

    public static void main(String[] args) {
        /*
         * Check Employee is Present or Absent - Use ((RANDOM)) for Attendance Check
         */
        double isPresent = Math.random();
        /*
         * apply if condition to get the employee is present or absent
         */
        if (isPresent<=0.5) {
            System.out.println("employee is present ");
        }
        else {
            System.out.println("employee is absent ");
        }
    }

}

