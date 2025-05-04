package day_wise_task;

import java.util.Scanner;

public class Task_30_Jan_t3_Smallest_Of_Three {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter Number2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter Number3: ");
        int n3 = sc.nextInt();

//        if(n1 < n2 && n2 < n3)
//        {
//            System.out.println("Number1 is Smallest number");
//        } else if (n3 < n2) {
//            System.out.println("Number3 is Smallest number");
//        }
//        else{
//            System.out.println("Number2 is Smallest number");
//        }


        if(n1 <= n2 && n1 <= n3) {
            System.out.println("Number1 is the smallest number");
        } else if (n2 <= n1 && n2 <= n3) {
            System.out.println("Number2 is the smallest number");
        } else {
            System.out.println("Number3 is the smallest number");
        }
    }
}
