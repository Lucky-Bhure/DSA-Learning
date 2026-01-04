package DSA_Logic_Building.Step1_ConditionalThinking._2_MultipleConditions;

import java.util.Scanner;

//7. Take two numbers and determine whether both are even, both are odd, or one is even and one is odd.

public class Question7 {

    static String determineEvenOdd(int num1, int num2) {
        if(num1%2 == 0) {
            if(num2%2 == 0)
                return (num1 +" and "+ num2 + " both are even");
            else
                return (num1 +" is even and "+ num2 + " is odd");
        } else {
            if(num2%2 == 0)
                return (num1 +" is odd and "+ num2 + " is even");
            else
                return (num1 +" and "+ num2 + " both are odd");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print(determineEvenOdd(num1, num2));
    }
}
