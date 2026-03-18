package DSA_Logic_Building.Step2_LoopingPatterns._1_BasicLooping;

import java.util.Scanner;

// 10. Print the product of digits of a given number.
public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        String str = String.valueOf(num);
        int product = 1;
        int value = num;

        for(int i = 0; i < str.length(); i++) {
            int temp = value % 10;
            product = product * temp;

            value = (value - temp)/10;
        }

        System.out.println("Product of digits of "+num+" is "+ product);
    }
}
