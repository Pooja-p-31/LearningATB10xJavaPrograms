//19)  Calculate Bonus Based on Salary and Years of Experience.
//
//          :- take the salary and Year info from the User.
//
//Implement Bonus Calculation Logic:
//
//Define the bonus structure based on salary and years of experience.
//
//           :- If years of experience is less than 1 year: No bonus.
//
//        :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
//
//           :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
//
//           :- If years of experience is greater than 6 years: Bonus is 15% of the salary.


package day_wise_task;

import java.util.Scanner;

public class Task_31_Jan_t5_Bonus_Calculate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total year of experience you have: ");
        int year = sc.nextInt();
        System.out.println("Enter your salary: ₹");
        int salary = sc.nextInt();
        double bonus = 0.0;

        if (year >= 1 && year <= 3)
        {
            bonus = 0.05 * salary;
            System.out.println("Bonus based on your salary is for experience btw 1&3 year is: " +bonus);
        } else if (year >= 4 && year <= 6) {
            bonus = 0.10 * salary;
            System.out.println("Bonus based on your salary is for experience btw 4&6 year is: " +bonus);
        } else if (year > 6) {
            bonus = 0.15 * salary;
            System.out.println("Bonus based on your salary is for experience more than 6 year is: " +bonus);
        }
        else {
            System.out.println("More than 1 year experience is required for bonus");
        }
        sc.close();
    }
}
