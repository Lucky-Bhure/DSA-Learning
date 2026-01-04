package DSA_Logic_Building.Step1_ConditionalThinking._1_SimpleConditions;

import java.util.Scanner;

// 9. Take a character and check if it’s a vowel or consonant.
public class Question9 {

    static String isVowelOrConsonant(char c) {

        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return "Vowel";
        }
        return "Consonant";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your character: ");
        char character = scanner.next().charAt(0);

        System.out.print("Provided character is " + isVowelOrConsonant(character));

    }
}
