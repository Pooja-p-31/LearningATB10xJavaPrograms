package ex_10_Functions;

public class Lab_62_functions {

    public static void main(String[] args) {

//        ### **User Defined Functions.**
//        1. Without Parameters and Without Return Type.
//        2. Without Parameters but With Return Type
//        3. With Parameters and Without Return Type
//        4. With Parameters and With Return Type

        greet();

        String s = greet_with_hello();
        System.out.println(s);

        int a = age_to_vote();
        System.out.println("Age to vote is: " +a);
    }

    //1. Without Parameters and Without Return Type.
    static void greet()
    {
        System.out.println("Hello, I am function Without Parameters and Without Return Type");
    }


    //2. Without Parameters but With Return Type
    static String greet_with_hello()
    {
            return "Hello, I am function Without Parameters but With Return Type";
    }

    static int age_to_vote()
    {
        return 18;
    }

    //3. With Parameters and Without Return Type
}
