package ex_07_For_Loop;

public class Lab_50_Even_Odd_50 {

    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i <= 50; i++){
            if(i % 2 == 0)
            {
                System.out.println("Even Number" +i);
            }
            else {
                System.out.println("Odd Number" +i);
            }
        }
    }
}
