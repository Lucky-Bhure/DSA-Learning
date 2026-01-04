package DSA_Logic_Building.Step1_ConditionalThinking._2_MultipleConditions;

import java.util.Scanner;

// 10. Take a month number (1–12) and print the number of days in that month (ignore leap years).
public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = scanner.nextInt();

        switch(num) {
            case 1: System.out.print("January: 31 Days");
                break;
            case 2: System.out.print("February: 28 Days");
                break;
            case 3: System.out.print("March: 31 Days");
                break;
            case 4: System.out.print("April: 30 Days");
                break;
            case 5: System.out.print("May: 31 Days");
                break;
            case 6: System.out.print("June: 30 Days");
                break;
            case 7: System.out.print("July: 31 Days");
                break;
            case 8: System.out.print("August: 31 Days");
                break;
            case 9: System.out.print("September: 30 Days");
                break;
            case 10: System.out.print("October: 31 Days");
                break;
            case 11: System.out.print("November: 30 Days");
                break;
            case 12: System.out.print("December: 31 Days");
                break;
            default: System.out.print("Enter valid number");
                break;
        }
    }
}
