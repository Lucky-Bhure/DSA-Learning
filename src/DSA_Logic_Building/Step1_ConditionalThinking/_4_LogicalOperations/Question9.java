package DSA_Logic_Building.Step1_ConditionalThinking._4_LogicalOperations;

import java.util.Scanner;

// 9. Take electricity units consumed and calculate the bill as per slabs (using if-else).
// First 100 - Rs 1.5 per unit
// Second 101-200  - Rs 2.5 per unit
// Above 200 - Rs 4.0 per unit

public class Question9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter electricity units: ");
        double units = scanner.nextInt();

        double amount = 0;

        if(units > 200) {
            double temp = 200 - units;
            amount = amount + temp * 4 * (-1);
            units = units + temp;
        }

        if(units > 100) {
            double temp = 100 - units;
            amount = amount + temp * 2.5 * (-1);
            units = units + temp;
        }

        if(units > 0) {
            amount = amount + units * 1.5;
        }

        System.out.print("Total bill: Rs. "+ amount);
    }
}
