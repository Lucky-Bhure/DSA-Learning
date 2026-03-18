package DSA_Logic_Building.Step2_LoopingPatterns._1_BasicLooping;

import java.util.Scanner;

// 7. Print the sum of all even numbers up to n.
public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        int sum = 0;

        for(int i = 1; i <= num; i++) {
            if(i % 2 == 0) {
                sum = sum + i;
            }
        }

        System.out.println("Sum of all even numbers up to "+num+" is "+sum);
    }
}
