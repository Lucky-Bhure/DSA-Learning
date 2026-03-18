package DSA_Logic_Building.Step2_LoopingPatterns._1_BasicLooping;

import java.util.Scanner;

// 1. Print numbers from 1 to 10.
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        for(int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
