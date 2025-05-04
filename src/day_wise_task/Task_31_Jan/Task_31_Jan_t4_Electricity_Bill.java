//18 )  Electricity Bill Calculation (Based on Units Consumed)
//
//           :- take the input from the user of Units.
//
//Implement Rate Structure:
//
//Define the rate structure for calculating the bill based on the number of units consumed.
//
//        :-  First 100 units: 0.50Rs per unit
//
//            :-  Next 100 units (101-200): 0.75Rs per unit
//
//            :- Next 100 units (201-300): 1.20Rs per unit
//
//            :- Above 300 units: 1.50Rs per unit

package day_wise_task;

import java.util.Scanner;

public class Task_31_Jan_t4_Electricity_Bill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the units of electricity consumed: ");
        int unit_consumed = sc.nextInt();
        double bill = 0;

        if (unit_consumed <= 100) {
            bill = unit_consumed * 0.50;
        } else if (unit_consumed <= 200) {
            bill = (100 * 0.50) + ((unit_consumed - 100) * 0.75);
        } else if (unit_consumed <= 300) {
            bill = (100 * 0.50) + (100 * 0.75) + ((unit_consumed - 200) * 1.20);
        } else {
            bill = (100 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((unit_consumed - 300) * 1.50);
        }

        System.out.println("Total electricity bill: ₹" + bill);
    }
}
