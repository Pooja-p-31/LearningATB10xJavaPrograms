//Check if a Triangle is Valid Based on Three Sides.

package day_wise_task;

import java.util.Scanner;

public class Task_30_Jan_t9_Triangle {

    public static void main(String[] args) {
        int s1, s2, s3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sides of the triangle: ");
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();

        if(s1 + s2 > s3 && s2 + s3 > s1 && s3 + s1 > s2)
        {
            System.out.println("It is a triangle");
        }
        else {
            System.out.println("It is not a triangle");
        }
        sc.close();
    }
}
