package day_wise_task.Task_01_Feb;

import java.util.Scanner;

public class Task_01_Feb_URL {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Paste the URL: ");
        String url = sc.next();


        if (url.contains(".com"))
        {
            System.out.println("The website type is: Commercial website");
        } else if (url.contains(".gov")) {
            System.out.println("The website type is: Government website");
        } else if (url.contains(".net")) {
            System.out.println("The website type is: Network-related website");
        } else if (url.contains(".edu")) {
            System.out.println("The website type is: Educational institution");
        } else if (url.contains(".info")) {
            System.out.println("The website type is: Informational website");
        }
        else {
            System.out.println("Enter a valid URL");
        }

    }
}
