package day_wise_task;

import java.util.Scanner;

public class Task_30_Jan_t7_Prime_Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if(num < 2)
        {
            System.out.println("It is not a Prime Number");
            sc.close();
            return;
        }

        for(int i = 2; i < num; i++)
        {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime)
        {
            System.out.println("It is a Prime Number");
        }
        else {
            System.out.println("It is not a Prime Number");
        }

    }
}
