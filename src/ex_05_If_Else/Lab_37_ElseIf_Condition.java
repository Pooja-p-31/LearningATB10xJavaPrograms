package ex_05_If_Else;

import java.util.Scanner;

public class Lab_37_ElseIf_Condition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n1");
        int n1 = sc.nextInt();
        System.out.println("Enter the number n2");
        int n2 = sc.nextInt();

        if(n1 > n2)
        {
            System.out.println("n1 is greater");
        }
        else if (n2 > n1) {
            System.out.println("n2 is greater");
        }
        else {
            System.out.println("both are equal");
        }

    }
}
