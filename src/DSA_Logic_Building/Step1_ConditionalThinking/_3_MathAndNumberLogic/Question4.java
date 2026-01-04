package DSA_Logic_Building.Step1_ConditionalThinking._3_MathAndNumberLogic;


import java.util.Scanner;

// 4. Check whether a given integer is single-digit, double-digit, or multi-digit.
public class Question4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter four digit number (e.g., 1234): ");
        int num = scanner.nextInt();

        if(num < 10 && num >= 0)
            System.out.print("Number is a single-digit.");
        else if(num <= 99)
            System.out.print("Number is a double-digit.");
        else
            System.out.print("Number is a multi-digit.");

    }
}
