package ex_03_Ternary_Operator;

public class Lab_12_Age_Classification {
    public static void main(String[] args) {

        //Adult, Minor, Senior
        //Senior -> 65
        //Minor -> <18
        //Adult -> >18


        int age = 6;
        String ans = (age <= 18) ? "Minor"  : ((age < 65) ? "Adult" : "Senior");
        System.out.println("Your are a: " +ans);

    }
}
