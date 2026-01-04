package DSA_Logic_Building.Step1_ConditionalThinking._1_SimpleConditions;

import java.util.Scanner;

// 6. Take two numbers and print the larger one.
public class Question6 {
    static String largerNumber ( long a, long b ) {
        if (a > b) {
            return a+ " is a larger number";
        } else if (a < b) {
            return b+ " is a larger number";
        }
        return "Both a same numbers";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        long num1 = scanner.nextLong();

        System.out.print("Enter your second number: ");
        long num2 = scanner.nextLong();
        System.out.print(largerNumber(num1, num2));
    }
}
