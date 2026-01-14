package DSA_Logic_Building.Step1_ConditionalThinking._4_LogicalOperations;

import java.util.Scanner;

// 1. Take a character and check if it is a letter, a digit, or neither.
public class Question1 {

    static String identifyChar(char c) {

        if(Character.isAlphabetic(c)) {
            return "a letter";
        }

        if(Character.isDigit(c)) {
            return "a digit";
        }

        return "neither letter nor digit";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your character: ");
        char c = scanner.next().charAt(0);

        System.out.print("Entered character is "+ identifyChar(c));
    }
}
