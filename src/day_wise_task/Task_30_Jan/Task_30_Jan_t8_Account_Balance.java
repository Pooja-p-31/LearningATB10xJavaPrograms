//Steps to Write the Program
//
//        1️⃣ Initialize the account balance with a fixed amount (e.g., ₹10,000).
//        2️⃣ Take user input for the amount they want to withdraw.
//        3️⃣ Check withdrawal conditions:
//
//        The amount should be greater than zero.
//
//        The amount should be a multiple of 100 (common ATM rule).
//
//        The amount should not exceed the account balance.
//        4️⃣ Deduct the amount from the balance if conditions are met.
//        5️⃣ Display the updated balance or an error message if the withdrawal fails.

package day_wise_task;

import java.util.Scanner;

public class Task_30_Jan_t8_Account_Balance {

    public static void main(String[] args) {

        int amt = 10000;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: ");
        int withdraw = sc.nextInt();

        if(withdraw > 0 && withdraw % 100 == 0){
            if (withdraw <= amt){
                amt -= withdraw;
                System.out.println("Your remaining balance is: " +amt);
            }
            else {
                System.out.println("Insufficient balance");
            }
    }
        else {
            System.out.println("Invalid amount");
        }
        sc.close();
}}
