package DSA_Logic_Building.Step1_ConditionalThinking._2_MultipleConditions;

import java.util.Scanner;

// 4. Check if one of two given numbers is a multiple of the other.
// Valid Multiple -> meaning the smaller number divides evenly into the larger one => small%larger == 0

public class Question4 {

    static boolean isValidMultiple (int num1, int num2) {

        if(num1 < num2 && num2%num1 == 0) {
            return true;
        } else if (num1 > num2 && num1%num2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        if(isValidMultiple(num1, num2))
            System.out.print(num1 + " and "+ num2+ " are a valid multiple");
        else
            System.out.print(num1 + " and "+ num2+ " are not a valid multiple");

    }
}
