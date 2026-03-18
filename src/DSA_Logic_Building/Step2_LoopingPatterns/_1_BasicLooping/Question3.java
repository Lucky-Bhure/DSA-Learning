package DSA_Logic_Building.Step2_LoopingPatterns._1_BasicLooping;

import java.util.Scanner;

// 3. Print all odd numbers between 1 and 100.
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        System.out.println("Odd number from 1 to "+num+ " are");
        for(int i = 1; i <= num; i++) {
            if(i % 2 == 1 ) {
                System.out.println(i);
            }
        }
    }
}
