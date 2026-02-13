package DSA_Logic_Building.Step1_ConditionalThinking._5_CreativeTrickyLogicalScenarios;

import java.util.Scanner;

// 6. Take three numbers and check if they are in geometric progression.
public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers to check GP (Ex., a b c): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(b * b == a * c) {
            System.out.println(a+ " "+b+" and "+ c+ " are in geometric progression");
        } else {
            System.out.println(a+ " "+b+" and "+ c+ " are not in geometric progression");
        }
    }
}
