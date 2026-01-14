package DSA_Logic_Building.Step1_ConditionalThinking._4_LogicalOperations;

import java.util.Scanner;

// 4. Take 24-hour time (hours and minutes) and print whether it is AM or PM.
public class Question4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hours (in 24 hours): ");
        int hour = scanner.nextInt();

        System.out.print("Enter minutes (in 60 minutes): ");
        int minute = scanner.nextInt();


        if(minute > 59 || hour > 23 || hour < 0 || minute < 0) {
            System.out.print("Invalid time");
        } else if(hour < 12) {
            System.out.print("It's AM");
        } else {
            System.out.print("It's PM");
        }

        scanner.close();
    }
}
