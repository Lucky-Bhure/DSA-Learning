package DSA_Logic_Building.Step1_ConditionalThinking._5_CreativeTrickyLogicalScenarios;

// 8. Take an integer (1–9999) and check if the sum of its digits is greater than the product of its digits.

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number (Ex., 1-9999): ");
        int num = scanner.nextInt();

        String str = String.valueOf(num);

        int value = num;
        int sum = 0;
        int product = 1;

        for(int i = 0; i < str.length(); i++) {
            int temp = value % 10;
            sum += temp;
            product *= temp;

            value = (value - temp)/10;
        }

        if(sum == product) {
            System.out.println("Sum: "+ sum);
            System.out.println("Product: "+ product);
            System.out.println(num + " is a valid number");
        } else {
            System.out.println(num + " is not a valid number");
        }
    }
}
