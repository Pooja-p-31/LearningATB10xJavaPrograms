package ex_05_If_Else;

import java.util.Scanner;

public class Lab_39_HackerRank_Q2 {

    public static void main(String[] args) {

        //Triangle Classifier
        //There are 3 types of triangle
        //1) Acute(all equal) 2) Obtuse(2 sides equal) 3) Scalene(All sides are different)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side of triangle: ");
        double s1 = sc.nextDouble();
        System.out.println("Enter the second side of triangle: ");
        double s2 = sc.nextDouble();
        System.out.println("Enter the third side of triangle: ");
        double s3 = sc.nextDouble();

        if (s1 <= 0 || s2 <= 0 || s3 <= 0) {
            System.out.println("Invalid input");
        } else {
            if (s1 == s2 && s2 == s3) {
                System.out.println("It is an acute triangle, coz all sides are equal");
            } else if (s1 != s2 && s1 == s3) {
                System.out.println("It is an obtuse triangle, coz only two sides are equal");
            } else {
                System.out.println("It is a scalene triangle, all sides are different");
            }
            sc.close();
        }
    }
}
