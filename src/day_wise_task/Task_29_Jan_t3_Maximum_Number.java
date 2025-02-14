package day_wise_task;

import java.util.Scanner;

public class Task_29_Jan_t3_Maximum_Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter a number2: ");
        int num2 = sc.nextInt();

        if(num1 > num2)
        {
            System.out.println("Number1 is greater");
        }
        else {
            System.out.println("Number2 is greater");
        }

    }
}
