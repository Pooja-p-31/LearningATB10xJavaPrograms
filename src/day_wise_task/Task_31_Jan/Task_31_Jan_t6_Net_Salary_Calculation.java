package day_wise_task;

import java.util.Scanner;

public class Task_31_Jan_t6_Net_Salary_Calculation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your basic salary: ₹");
        int basic_salary = sc.nextInt();
        double hra = 0.20 * basic_salary;
        double da = 0.10 * basic_salary;
        double tax = 0.05 * basic_salary;
        double gross_salary = 0;

        gross_salary = basic_salary + hra + da;
        double net_salary = gross_salary - tax;

        System.out.println("*****SALARY DETAILS*****");
        System.out.println("Basic Salary is: " +basic_salary);
        System.out.println("HRA (20%): ₹" +hra);
        System.out.println("DA (10%): ₹" +da);
        System.out.println("Tax Deduction (5%): ₹" +tax);
        System.out.println("Gross Salary: ₹" +gross_salary);
        System.out.println("Net Salary: ₹" +net_salary);
        sc.close();
    }

}
