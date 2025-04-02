package day_wise_task;

import java.util.Scanner;

public class Task_30_Jan_t2_Smallest_Of_Two {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter Number2: ");
        int n2 = sc.nextInt();

        if(n1 < n2)
        {
            System.out.println("Number1 is is the smallest number");
        }
        else
        {
            System.out.println("Number2 is is the smallest number");
        }

    }
}
