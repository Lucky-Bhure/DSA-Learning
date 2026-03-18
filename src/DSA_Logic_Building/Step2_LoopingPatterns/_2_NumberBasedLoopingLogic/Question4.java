package DSA_Logic_Building.Step2_LoopingPatterns._2_NumberBasedLoopingLogic;

import java.util.Scanner;

// 4. Find the sum of digits of a number.
public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        String str = String.valueOf(num);
        int sum = 0;
        int value = num;

        for(int i = 0; i < str.length(); i++) {
            int temp = value % 10;
            sum = sum + temp;

            value = (value - temp)/10;
        }

        System.out.println("Sum of digits of "+num+" is "+ sum);
    }
}
