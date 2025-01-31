package ex_04_Incement_Decrement_Operator;

public class Lab_23_Task_Greatest_of_3_No {

    public static void main(String[] args) {

        int a = 100;
        int b = 12;
        int c = 13;

        int greatest = (a >= b ) ? ((a >= c) ? a : b) : (b >= c) ? b :c;
        System.out.println(greatest);

    }
}
