package DSA_Logic_Building.Step2_LoopingPatterns._1_BasicLooping;

import java.util.Scanner;

// 6. Print the sum of first n natural numbers.
public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        int sum = 0;

        for(int i = 1; i <= num; i++) {
            sum = sum + i;
        }

        System.out.println("Sum of first "+num+" natural numbers is "+sum);
    }
}
