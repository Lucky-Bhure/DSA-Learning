package DSA_Logic_Building.Step1_ConditionalThinking._4_LogicalOperations;

import java.util.Scanner;

// 8. Take a weekday number (1–7) and determine if it is a weekday or weekend.
public class Question8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number (1-7): ");
        int num = scanner.nextInt();

        switch (num) {
            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thursday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6: System.out.println("Saturday");
                break;
            case 7: System.out.println("Sunday");
                break;
        }
        if(num >= 1 && num <= 5) {
            System.out.print("Its a Weekday");
        } else if (num == 6 || num == 7) {
            System.out.print("Its a Weekend");
        }


    }
}
