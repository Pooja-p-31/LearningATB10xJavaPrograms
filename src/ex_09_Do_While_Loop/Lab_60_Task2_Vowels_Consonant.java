package ex_09_Do_While_Loop;

public class Lab_60_Task2_Vowels_Consonant {
    public static void main(String[] args) {

        String name = "Pramod";

        int vowels = 0;
        int consonant = 0;

        for(int i = 0; i < name.length(); i++)
        {
            char ch = name.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowels++;
            }
            else
            {
                consonant++;
            }
        }

        System.out.println("Vowels Count: " +vowels);
        System.out.println("Consonant Count: " +consonant);
    }
}
