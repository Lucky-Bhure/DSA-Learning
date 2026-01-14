package DSA_Logic_Building.Step1_ConditionalThinking._4_LogicalOperations;

import java.util.Scanner;

// 5. Take income and age, and check if eligible for tax (age > 18 and income > 5 L).
public class Question5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your Income (in Lakhs): ");
        int income = scanner.nextInt();

        if(age > 18 && income > 5) {
            System.out.print("Eligible for Income Tax");
        } else {
            System.out.print("Not eligible for Income Tax");
        }

    }
}
