package DSA_Logic_Building.Step1_ConditionalThinking._3_MathAndNumberLogic;

import java.util.Scanner;

// 3. Take a 4-digit number and check if the first and last digits are equal.
public class Question3 {

    static boolean isEqual(int num) {

        // Separate the digits
        int last = num % 10;
        num = (num - last)/10;

        int third = num % 10;
        num = (num - third)/10;

        int second = num % 10;
        num = (num - second)/10;

        int first = num % 10;

        return first == last;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter four digit number (e.g., 1234): ");
        int num = scanner.nextInt();

        if( num <= 999 || num > 9999 ) {
            System.out.print("Enter valid 4 digit number");
            System.exit(0);
        }

        if(isEqual(num))
            System.out.print("First and Last digits are equal.");
        else
            System.out.print("First and Last digits are not equal.");

    }
}
