package day_wise_task;

import java.util.Scanner;

public class Task_29_Jan_t4_Vowels_Consonant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            System.out.println("It is a vowel");
        }
        else {
            System.out.println("It is a consonant");
        }
    }
}
