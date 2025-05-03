package day_wise_task;

import java.util.Scanner;

public class Task_31_Jan_t7_Person_Can_Travel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 0 || age > 100) {
            System.out.println("Please enter a valid age.");
        } else if (age < 18) {
            System.out.println("You are not eligible to travel.");
        } else {
            System.out.print("Do you have a valid visa? (true/false): ");
            boolean visa_status = sc.nextBoolean();

            if (visa_status) {
                System.out.println("You are eligible to travel.");
            } else {
                System.out.println("You are not eligible to travel due to missing visa.");
            }
        }
    }
}
