package DSA_Logic_Building.Step1_ConditionalThinking._5_CreativeTrickyLogicalScenarios;

import java.util.Scanner;

// 1. Take coordinates (x, y) and check if the point lies on the X-axis, Y-axis, or at the origin.
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X co-ordinate: ");
        float x = scanner.nextFloat();

        System.out.print("Enter Y co-ordinate: ");
        float y = scanner.nextFloat();

        if(x == 0 && y == 0 ) {
            System.out.print("Point lie at origin");
        } else if(x == 0 ) {
            System.out.print("Point lie at X-axis");
        } else if(y == 0 ) {
            System.out.print("Point lie at Y-axis");
        } else {
            System.out.print("Point does not lie on X-axis, Y-axis and origin");
        }
    }
}
