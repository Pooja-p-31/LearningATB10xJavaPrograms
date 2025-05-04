package day_wise_task;

import java.util.Scanner;

public class Task_29_Jan_t1_Positive_Negative_Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num >= 0){
            System.out.println("Positive number");
        }
        else {
            System.out.println("Negative number");
        }
    }
}
