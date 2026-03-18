package DSA_Logic_Building.Step2_LoopingPatterns._1_BasicLooping;

import java.util.Scanner;

// 2. Print all even numbers between 1 and 100.
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        System.out.println("Even number from 1 to "+num+ " are");
        for(int i = 1; i <= num; i++) {
            if(i % 2 == 0 ) {
                System.out.println(i);
            }
        }
    }
}
