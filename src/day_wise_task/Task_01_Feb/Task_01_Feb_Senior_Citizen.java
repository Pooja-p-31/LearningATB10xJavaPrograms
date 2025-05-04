package day_wise_task.Task_01_Feb;

import java.util.Scanner;

public class Task_01_Feb_Senior_Citizen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if(age < 0)
        {
            System.out.println("Age should be more than 0");
        } else if (age <= 12) {
            System.out.println("You belongs to Child age group");
        } else if (age <= 19) {
            System.out.println("You belongs to Teenagers age group");
        } else if (age <= 64) {
            System.out.println("You belongs to Adult age group");
        } else {
            System.out.println("You belongs to Senior Citizen age group");
        }
    }
}
