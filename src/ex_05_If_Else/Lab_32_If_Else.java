package ex_05_If_Else;

import java.util.Scanner;

public class Lab_32_If_Else {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you are: ");
        int age = sc.nextInt();
        if (age > 18){
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("You are not eligible to vote!");
        }
    }
}
