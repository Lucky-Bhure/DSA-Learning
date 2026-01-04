package DSA_Logic_Building.Step1_ConditionalThinking._3_MathAndNumberLogic;

import java.util.Scanner;

// 7. Check if an amount can be evenly divided into 2000, 500, and 100 currency notes.
public class Question7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amount = scanner.nextInt();

        int _2000 = amount/2000;
        int new_ammount = amount % 2000;

        int _500 = new_ammount / 500;
        new_ammount = new_ammount % 500;

        int _100 = new_ammount / 100;

        if(amount%100 == 0) {
            System.out.print(_2000 + " 2000 note, ");
            System.out.print(_500 + " 500 note and ");
            System.out.print(_100 + " 100 note");
        } else {
            System.out.print("Enter valid amount");
        }
    }
}
