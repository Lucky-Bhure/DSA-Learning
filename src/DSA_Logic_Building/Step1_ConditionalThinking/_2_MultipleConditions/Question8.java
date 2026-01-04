package DSA_Logic_Building.Step1_ConditionalThinking._2_MultipleConditions;

import java.util.Scanner;

//8. Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’.
public class Question8 {

    static String characterCheck(char character) {
        if(character >= 'a' &&  character <= 'm') {
            return "Character lies between 'a' and 'm'";
        } else if (character >= 'n' && character <= 'z') {
            return "Character lies between 'n' and 'z'";
        }
        return "Character does not lies between 'a' and 'm' or 'n' and 'z'";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your character: ");
        char character = scanner.next().charAt(0);

        System.out.print(characterCheck(character));

    }
}
