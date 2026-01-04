package DSA_Logic_Building.Step1_ConditionalThinking._3_MathAndNumberLogic;

import java.util.Scanner;

//  10. Check whether a number is a perfect square (without using the square root function).
public class Question10 {

    static boolean isPerfectSquare(int num) {
        for (int i = 1 ; i <= num/2 ;i++){
            if( i*i == num)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = scanner.nextInt();

        if(isPerfectSquare(num))
            System.out.print(num + " is a perfect square");
        else
            System.out.print(num + " is not a perfect square.");
    }
}
