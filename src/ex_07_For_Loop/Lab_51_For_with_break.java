package ex_07_For_Loop;

public class Lab_51_For_with_break {

    public static void main(String[] args) {

        int i = 0;
        for(i = 0; i < 50; i++){
            if(i == 15){
                break;
            }
            System.out.println(i);
        }
    }
}
