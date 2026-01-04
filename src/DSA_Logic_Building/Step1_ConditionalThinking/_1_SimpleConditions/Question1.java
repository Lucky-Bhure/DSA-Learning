package DSA_Logic_Building.Step1_ConditionalThinking._1_SimpleConditions;
import java.util.Scanner;

// 1. Take a number and print whether it’s positive, negative, or zero.
class Question1 {

    static String typeOfNumber (int num) {
         if (num > 0) {
             return "Positive";
         } else if (num < 0) {
             return "Negative";
         } else {
             return "Zero";
         }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = scanner.nextInt();
        System.out.print("Your number is "+ typeOfNumber(num));

    }
}