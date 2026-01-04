package DSA_Logic_Building.Step1_ConditionalThinking._3_MathAndNumberLogic;


import java.util.Scanner;

// 2. Take a 3-digit number and determine if the middle digit is the largest, smallest, or neither.
public class Question2 {

    static String determine(int num) {

        // Separate the digits
        int last = num % 10;
        num = (num - last)/10;

        int mid = num % 10;
        num = (num - mid)/10;

        int first = num % 10;

        if(mid > last && mid > first)
            return "largest";

        if(mid < last && mid < first)
            return "smallest";

        return "neither largest nor smallest";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three digit number (e.g., 123): ");
        int num = scanner.nextInt();

        if( num <= 99 || num >= 999 ) {
            System.out.print("Enter valid 3 digit number");
            System.exit(0);
        }

        System.out.print("Middle digit is "+ determine(num));
    }

}
