package DSA_Logic_Building.Step1_ConditionalThinking._3_MathAndNumberLogic;


import java.util.Scanner;

// 8. Check if a number lies within the range [100, 999].
public class Question8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int num = scanner.nextInt();

        if(num >= 100 && num <=999 )
            System.out.print(num + " lies within range [100, 999]");
        else
            System.out.print("Enter valid number.");
    }
}
