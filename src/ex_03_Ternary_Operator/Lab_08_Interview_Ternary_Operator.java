package ex_03_Ternary_Operator;

public class Lab_08_Interview_Ternary_Operator {
    public static void main(String[] args) {
        int number = 5;
        String ans = (number > 10) ? (number > 20 ? "G > 20" : "B 10 to 20") : "B";
        System.out.println(ans);
    }
}
