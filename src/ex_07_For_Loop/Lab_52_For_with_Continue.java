package ex_07_For_Loop;

public class Lab_52_For_with_Continue {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++)
        {
            if(i == 6){
                continue;
            }
            System.out.println(i);
        }
    }
}
