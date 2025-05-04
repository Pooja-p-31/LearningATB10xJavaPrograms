package day_wise_task;

import java.util.Scanner;

public class Task_31_Jan_t2_Armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int original_num = sc.nextInt();
        int temp_var = original_num;
        int digit_count = 0;

        while (temp_var != 0)
        {
            digit_count++;
            temp_var /= 10;
        }

        int arm=0;
        int power = digit_count;
        temp_var = original_num;
        while (temp_var != 0)
        {
            int digit=temp_var % 10;
            arm+= Math.pow(digit, power);
            temp_var/=10;
        }

        if(arm == original_num)
        {
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not an Armstrong number");
        }
        sc.close();
    }
}
