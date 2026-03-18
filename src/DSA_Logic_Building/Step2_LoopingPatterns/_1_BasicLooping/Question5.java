package DSA_Logic_Building.Step2_LoopingPatterns._1_BasicLooping;

import java.util.Scanner;

// 5. Print the table of a given number (n × 1 to n × 10).
public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        System.out.println("Table of "+num+ " are follow: ");
        for(int i = 1; i <= 10; i++) {
            System.out.println(num +" * "+ i+" = "+num*i);
        }
    }
}
