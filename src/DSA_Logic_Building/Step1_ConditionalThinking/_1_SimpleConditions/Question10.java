package DSA_Logic_Building.Step1_ConditionalThinking._1_SimpleConditions;

import java.util.Scanner;

// 10. Take a character and check whether it’s uppercase, lowercase, a digit, or a special character.
public class Question10 {

    static String isCheck(char character) {
//        if(character >= 'A' && character <= 'Z' ) {
//            return "Uppercase";
//        } else if (character >= 'a' && character <= 'b') {
//            return "Lowercase";
//        } else if ( character >= '0' && character <= '9') {
//            return "Digit";
//        } else {
//            return "Special Character";
//        }
        if (Character.isUpperCase(character)) {
            return "Uppercase";
        } else if (Character.isLowerCase(character)) {
            return "Lowercase";
        } else if (Character.isDigit(character)) {
            return "Digit";
        } else {
            return "Special Character";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your character: ");
        char character = scanner.next().charAt(0);

        System.out.print("Provided character: " + isCheck(character));
    }
}
