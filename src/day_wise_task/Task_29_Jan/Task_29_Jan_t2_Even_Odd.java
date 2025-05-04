package day_wise_task;

import java.util.Scanner;

public class Task_29_Jan_t2_Even_Odd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num % 2 == 0)
        {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}
