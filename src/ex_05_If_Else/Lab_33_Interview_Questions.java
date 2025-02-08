package ex_05_If_Else;

import java.util.Scanner;

public class Lab_33_Interview_Questions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if(age > 18)
        {
            System.out.println("You can vote!!");
        }
        else{
            System.out.println("You can't vote!!");
        }

    }
}
