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

        greet_with_name("Pooja");

        greet_with_full_name("Pooja ", "Prajapati");

        details("Pooja", 24, 4000000);

        int sum = sum_of_a_b(10, 20);
        System.out.println("Sum of a and b is:" +sum);
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
    static void greet_with_name(String name)
    {
        System.out.println("Hi " +name );
    }

    static void greet_with_full_name(String f_name, String l_name)
    {
        System.out.println("Hi i am " +f_name + l_name  );
    }

    static void details(String name, int age, double salary)
    {
        System.out.println("Hello my name is: "+name+ "\nmy age is: "+age+ "\nmy salary is: " +salary);
    }

    //4. With Parameters and With Return Type

    static int sum_of_a_b(int a, int b)
    {
        return a+b;
    }

}

//52:50
