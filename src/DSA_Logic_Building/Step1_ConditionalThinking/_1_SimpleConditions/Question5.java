package DSA_Logic_Building.Step1_ConditionalThinking._1_SimpleConditions;

import java.util.Scanner;

// 5. Check if a given year is a leap year.
public class Question5 {

    static String isLeapYear(int num) {

        if((num % 4 ==0 && num % 100 != 0) || num % 400 == 0)
            return "Year is a Leap Year";

        return "Year is not a Leap Year";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");

        int num = scanner.nextInt();
        System.out.print(isLeapYear(num));
    }
}
