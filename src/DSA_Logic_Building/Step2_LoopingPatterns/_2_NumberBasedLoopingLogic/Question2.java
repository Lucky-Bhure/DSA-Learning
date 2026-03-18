package DSA_Logic_Building.Step2_LoopingPatterns._2_NumberBasedLoopingLogic;

import java.util.Scanner;

// 2. Print the reverse of a given number.
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        int value = num;
        int reverse = 0;

        for(int i = 0; i < String.valueOf(num).length(); i++) {
            int temp = value % 10;
            reverse = reverse*10 + temp;
            value = (value - temp)/10;
        }

        System.out.println("Reverse of "+num+" is "+reverse);
    }
}
