package DSA_Logic_Building.Step1_ConditionalThinking._3_MathAndNumberLogic;

import java.util.Scanner;

// 6. Take coordinates (x, y) and determine which quadrant the point lies in.
public class Question6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X co-ordinate: ");
        int x = scanner.nextInt();
        System.out.print("Enter Y co-ordinate: ");
        int y = scanner.nextInt();

        if(x > 0 && y > 0)
            System.out.println("("+x+", "+y+")"+" is belongs to 1st quadrant");
        else if (x > 0 && y < 0)
            System.out.println("("+x+", "+y+")"+" is belongs to 2nd quadrant");
        else if (x < 0 && y < 0)
            System.out.println("("+x+", "+y+")"+" is belongs to 3rd quadrant");
        else if (x < 0 && y > 0)
            System.out.println("("+x+", "+y+")"+" is belongs to 4th quadrant");

    }
}
