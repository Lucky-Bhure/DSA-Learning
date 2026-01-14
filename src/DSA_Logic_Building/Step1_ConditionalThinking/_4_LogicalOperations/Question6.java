package DSA_Logic_Building.Step1_ConditionalThinking._4_LogicalOperations;

import java.util.Scanner;

// 6. Take two numbers and check if both are positive and their sum is less than 100.

public class Question6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        if(num1 > 0 && num2 > 0) {
            System.out.println("Numbers are positive");
        }

        if(num1 + num2 < 100) {
            System.out.print("Sum is less than 100");
        } else {
            System.out.print("Sum is greater than 100");
        }
    }
}
