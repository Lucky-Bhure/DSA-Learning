package DSA_Logic_Building.Step1_ConditionalThinking._4_LogicalOperations;


import java.util.Scanner;

// 7. Take a single digit (0–9) and print its word form (“Zero” to “Nine”).
public class Question7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number (0-9): ");
        int num = scanner.nextInt();

        switch (num) {
            case 0: System.out.print("Zero");
                    break;
            case 1: System.out.print("One");
                    break;
            case 2: System.out.print("Two");
                    break;
            case 3: System.out.print("Three");
                    break;
            case 4: System.out.print("Four");
                    break;
            case 5: System.out.print("Five");
                    break;
            case 6: System.out.print("Six");
                    break;
            case 7: System.out.print("Seven");
                    break;
            case 8: System.out.print("Eight");
                    break;
            case 9: System.out.print("Nine");
                    break;
        }
    }
}
