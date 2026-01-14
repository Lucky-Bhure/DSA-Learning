package DSA_Logic_Building.Step1_ConditionalThinking._4_LogicalOperations;

import java.util.Scanner;

// 3. Take three numbers and print the median value (neither maximum nor minimum).
public class Question3 {

    static void display(int num1, int num2, int num3) {
        if(num1 == num2 && num2 == num3) {
            System.out.print("Middle: "+ num2);
        } else if (num1 < num2 && num2 < num3) {
            System.out.print("Middle: "+ num2);
        } else if (num2 < num1 && num1 < num3) {
            System.out.print("Middle: "+ num1);
        } else if (num1 < num3 && num3 < num2) {
            System.out.print("Middle: "+ num3);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        display(num1, num2, num3);

    }
}
