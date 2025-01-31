package ex_04_Incement_Decrement_Operator;

public class Lab_30_Greater_Of_Two {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        String max = (n1 > n2) ? args[0] : args[1];
        System.out.println(max);

    }
}
