package com.EmployeeWageComputation;
/**
 *
 * @author Prasanna
 *
 */
public class UsingSwitchCase {
    /*
     * Employee wage
     */
    int workingHour=8;
    int partTimeWorkingHour=4;
    int wagePerHour=20;

    public static void main(String[] args) {

        int isPresent = ((int) Math.random()*3);
        /*
         * use switch to check to employee is present absent or partime
         */
        switch (isPresent){
          /*
          *employee is absent
          */
            case 0:
                System.out.println("employee is absent");
                break;
            /*
             *employee is part time
             */
            case 1:
                System.out.println("employee is part time");
                break;
            /*
             *employee is present
             */
            case 2:
                System.out.println("employee is present");
                break;
        }

    }

}
