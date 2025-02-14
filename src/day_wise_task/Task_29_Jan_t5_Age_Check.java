package day_wise_task;

import java.util.Scanner;

public class Task_29_Jan_t5_Age_Check {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if(age >= 18)
        {
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("You are not eligible to vote");
        }
    }
}
