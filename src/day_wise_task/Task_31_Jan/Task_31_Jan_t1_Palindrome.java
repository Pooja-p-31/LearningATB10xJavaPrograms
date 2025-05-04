package day_wise_task;

import java.util.Scanner;

public class Task_31_Jan_t1_Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int original_num = num;
        int rev = 0;

        while (num > 0)
        {
            int last_num = num % 10;
            rev = rev * 10 + last_num;
            num = num / 10;
        }
        if(original_num == rev)
        {
            System.out.println("Number is Palindrome");
        }
        else {
            System.out.println("Number is not Palindrome");
        }
        sc.close();
    }
}
