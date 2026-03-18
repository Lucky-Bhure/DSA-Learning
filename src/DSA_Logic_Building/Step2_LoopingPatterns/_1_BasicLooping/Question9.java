package DSA_Logic_Building.Step2_LoopingPatterns._1_BasicLooping;

import java.util.Scanner;

// 9. Print the factorial of a given number.
public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        int factorial = 1;

        int sum = 0;

        for(int i = num; i >= 1; i--) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of "+num+" is "+factorial);
    }
}
