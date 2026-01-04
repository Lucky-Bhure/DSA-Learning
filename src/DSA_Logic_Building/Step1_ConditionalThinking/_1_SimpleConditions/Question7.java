package DSA_Logic_Building.Step1_ConditionalThinking._1_SimpleConditions;


import java.util.Scanner;

// 7. Take three numbers and print the largest.
public class Question7 {

    static String largestInThreeNumber (int a, int b, int c) {
        if ( a > b ) {
            if( a > c )
                return a + " is a largest number";
            else
                return c + " is a largest number";
        } else {
            if ( b > c)
                return b + " is a largest number";
            else
                return c + " is a largest number";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter your second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter your third number: ");
        int c = scanner.nextInt();

        System.out.print(largestInThreeNumber(a, b, c));
    }
}
