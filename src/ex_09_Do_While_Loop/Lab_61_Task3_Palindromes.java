package ex_09_Do_While_Loop;

public class Lab_61_Task3_Palindromes {

    public static void main(String[] args) {

        String str = "naman";
        String rev = "";


        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }



        if (str.equals(rev)) {
            System.out.println("Palindrome: " + str + " → reverse - " + rev);
        } else {
            System.out.println("Not a Palindrome: " + str + " → reverse - " + rev);
        }

    }
}
