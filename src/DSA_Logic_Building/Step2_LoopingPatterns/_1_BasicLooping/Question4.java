package DSA_Logic_Building.Step2_LoopingPatterns._1_BasicLooping;

import java.util.Scanner;

// 4. Print numbers from 10 down to 1.
public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        System.out.println("Even number from "+num+ " to 1 are");
        for(int i = num; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
