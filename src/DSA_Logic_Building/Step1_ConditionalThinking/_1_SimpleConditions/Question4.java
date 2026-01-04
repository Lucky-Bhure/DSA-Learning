package DSA_Logic_Building.Step1_ConditionalThinking._1_SimpleConditions;


import java.util.Scanner;

// 4. Check if a number is divisible by both 3 and 5
public class Question4 {

    static String divisibleBy3And5 ( int num ) {

        if ( num % 3 == 0 && num % 5 == 0) {
            return "Number is divisible by 3 and 5";
        }

        return "Number is not divisible by 3 and 5";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");

        int num = scanner.nextInt();
        System.out.print(divisibleBy3And5(num));
    }
}
