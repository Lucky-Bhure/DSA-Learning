package DSA_Logic_Building.Step1_ConditionalThinking._2_MultipleConditions;

import java.util.Scanner;

//6. Check voting eligibility for a given age (18+).

public class Question6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if(age >= 18) {
            System.out.print("You are eligible for voting");
        }

    }
}
