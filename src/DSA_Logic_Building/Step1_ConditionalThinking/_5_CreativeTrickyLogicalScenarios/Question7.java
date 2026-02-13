package DSA_Logic_Building.Step1_ConditionalThinking._5_CreativeTrickyLogicalScenarios;

import java.util.Scanner;

// 7. Take a 3-digit number and check if the sum of the first and last digit equals the middle digit.
public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three digit number (Ex., 100 to 999): ");
        int num = scanner.nextInt();

        if(num < 100 || num > 999) {
            System.out.println("Please enter valid number.");
            System.exit(0);
        }

        int temp = num;

        int last = temp % 10;
        temp = (temp - last)/10;

        int middle = temp % 10;
        temp = (temp - middle)/10;

        int first = temp;

        if( first+last == middle) {
            System.out.println(num + " is a valid number");
        } else {
            System.out.println(num + " is not a valid number");
        }
    }
}
