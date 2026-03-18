package DSA_Logic_Building.Step2_LoopingPatterns._2_NumberBasedLoopingLogic;

import java.util.Scanner;

// 1. Count the number of digits in a given number.
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        long num = scanner.nextLong();
        int count = 0;

        String str = String.valueOf(num);

        for(int i = 0; i < str.length(); i++) {
            count +=1;
        }

        System.out.println("Number of digits in "+num+" is "+count);
    }
}
