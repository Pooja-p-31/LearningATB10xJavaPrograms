package day_wise_task;

import java.util.Scanner;

public class Task_30_Jan_t6_Alphabets_Checker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type anything: ");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch))
        {
            System.out.println("It is an Alphabet");
        }
        else {
            System.out.println("It is not an Alphabet");
        }
    }
}
