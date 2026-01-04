package DSA_Logic_Building.Step1_ConditionalThinking._1_SimpleConditions;


import java.util.Scanner;

// 2. Check if a number is even or odd.
public class Question2 {

    static String evenOdd (int num) {
        if(num % 2 == 0) {
            return "Number is an Even";
        } else if (num % 2 == 1) {
            return "Number is an Odd";
        }

        return "Enter Valid Number";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = scanner.nextInt();

        System.out.print(evenOdd(num));
    }
}
