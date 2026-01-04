package DSA_Logic_Building.Step1_ConditionalThinking._2_MultipleConditions;

import java.util.Scanner;

// 5. Take the hour of the day (0–23) and print “Good Morning”, “Good Afternoon”, “Good Evening”, or “Good Night”.
// Time Range (Hour)  	Output
//      0 - 5	        Good Night
//      6 - 11	        Good Morning
//      12 - 16	        Good Afternoon
//      17 - 23	        Good Evening

public class Question5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Hour of day: ");
        int hour = scanner.nextInt();

        if (hour >= 0 && hour <= 5) {
            System.out.print("Good Night");
        } else if (hour >= 6 && hour <= 11 ) {
            System.out.print("Good Morning");
        } else if (hour >= 12 && hour <= 16 ) {
            System.out.print("Good Afternoon");
        } else if (hour >= 17 && hour <= 23 ) {
            System.out.print("Good Evening");
        } else {
            System.out.print("Enter valid hour of a day");
        }


    }
}
