package ex_03_Ternary_Operator;

public class Lab_13_Grade_Calculator {
    public static void main(String[] args) {
        int score = 33;

        String ans = (score <= 59) ? "Fail"
                     : (score <= 69) ? "D grade"
                     : (score <= 79) ? "C grade"
                     : (score <= 89) ? "B grade" : "A grade";

        System.out.println("You got: " +ans);
    }
}
