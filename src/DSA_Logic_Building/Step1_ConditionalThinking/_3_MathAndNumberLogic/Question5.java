package DSA_Logic_Building.Step1_ConditionalThinking._3_MathAndNumberLogic;

import java.util.Scanner;

// 5. Check if a number is a multiple of 7 or ends with 7.
public class Question5 {

    static boolean isDivisible(int num) {
        int temp = num % 10;

        return temp == 7;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        if(num % 7 == 0)
            System.out.print("Number is divisible by 7");
        else if(isDivisible(num))
            System.out.print("Number is ends with 7");

    }
}
