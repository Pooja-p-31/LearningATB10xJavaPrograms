package day_wise_task.Task_01_Feb;

import java.util.Scanner;

public class Task_01_Feb_Days_Conversion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days to convert into Years-Months-Days: ");
        int days = sc.nextInt();

        int year = days / 365;
        int remaining_days = days % 365;
        int month = remaining_days / 30;
        int days_left = remaining_days % 30;

        System.out.println("Total days you entered: " +days);
        System.out.println("Year:"+year+ " Month:"+month+ " Days:"+days_left);
    }
}