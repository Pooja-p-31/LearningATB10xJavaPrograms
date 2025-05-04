package day_wise_task.Task_01_Feb;

import java.util.Scanner;

public class Task_01_Feb_Divisible_Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if((num % 5 == 0) && (num % 11 == 0))
        {
            System.out.println("The number is divisible by 5 & 11");
        } else if (num % 5 == 0) {
            System.out.println("The number is divisible by 5");
        }
        else if (num % 11 == 0) {
            System.out.println("The number is divisible by 11");
        }
        else {
            System.out.println("The number is nor divisible by 5 and not divisible by 11");
        }

    }
}
