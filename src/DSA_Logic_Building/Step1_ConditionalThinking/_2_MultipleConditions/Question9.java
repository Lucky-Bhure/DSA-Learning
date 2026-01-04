package DSA_Logic_Building.Step1_ConditionalThinking._2_MultipleConditions;

import java.util.Scanner;

// 9. Take a day number (1–7) and print the corresponding day name.
public class Question9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = scanner.nextInt();

        switch(num) {
            case 1: System.out.print("Sunday");
                    break;
            case 2: System.out.print("Monday");
                    break;
            case 3: System.out.print("Tuesday");
                    break;
            case 4: System.out.print("Wednesday");
                    break;
            case 5: System.out.print("Thursday");
                    break;
            case 6: System.out.print("Friday");
                    break;
            case 7: System.out.print("Saturday");
                    break;
            default: System.out.print("Enter valid number");
                    break;
        }
    }
}
