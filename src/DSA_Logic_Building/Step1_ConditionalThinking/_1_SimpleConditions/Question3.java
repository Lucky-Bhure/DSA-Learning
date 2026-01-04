package DSA_Logic_Building.Step1_ConditionalThinking._1_SimpleConditions;

import java.util.Scanner;

// 3. Check if a number is divisible by 5.
public class Question3 {

    static String divisibleBy5 (int num ) {
        if(num % 5 == 0) {
            return "Number is divisible by 5";
        }

        return "Number is not divisible by 5";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");

        int num = scanner.nextInt();
        System.out.print(divisibleBy5(num));
    }
}
