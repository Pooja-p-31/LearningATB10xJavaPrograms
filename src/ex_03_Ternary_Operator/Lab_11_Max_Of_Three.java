package ex_03_Ternary_Operator;

public class Lab_11_Max_Of_Three {
    public static void main(String[] args) {
        int a = 1000;
        int b = 200;
        int c = 30;
        int max = (b >= c) ? ((b >= a) ? b : a) : ((c >= a) ? c : a);
        System.out.println("Largest number is:" +max);
    }
}
