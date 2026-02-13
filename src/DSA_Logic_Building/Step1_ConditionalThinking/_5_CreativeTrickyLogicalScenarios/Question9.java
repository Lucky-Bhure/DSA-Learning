package DSA_Logic_Building.Step1_ConditionalThinking._5_CreativeTrickyLogicalScenarios;

// 9. Take two dates (day and month) and determine which one comes first in the calendar.

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first day and month (Ex., day month): ");
        int day1 = scanner.nextInt();
        int month1 = scanner.nextInt();

        if(day1 < 1 || day1 > 31 || month1 < 1 || month1 > 12) {
            System.out.print("Please enter valid date");
            System.exit(0);
        }

        System.out.println("Enter second day and month (Ex., day month): ");
        int day2 = scanner.nextInt();
        int month2 = scanner.nextInt();

        if(day2 < 1 || day2 > 31 || month2 < 1 || month2 > 12) {
            System.out.println("Please enter valid date");
            System.exit(0);
        }

        if(month1 > month2) {
            System.out.println(day2+"/"+month2+" is comes first");
            System.out.println(day1+"/"+month1+" is comes second");
        } else if(month1 < month2) {
            System.out.println(day1+"/"+month1+" is comes first");
            System.out.println(day2+"/"+month2+" is comes second");
        } else {
            if(day2 > day1) {
                System.out.println(day1+"/"+month1+" is comes first");
                System.out.println(day2+"/"+month2+" is comes second");
            } else if(day2 < day1) {
                System.out.println(day2+"/"+month2+" is comes first");
                System.out.println(day1+"/"+month1+" is comes second");
            } else {
                System.out.println("Both dates are same day.");
            }
        }


    }
}
