package DSA_Logic_Building.Step1_ConditionalThinking._5_CreativeTrickyLogicalScenarios;

// 5. Take three numbers and check if they are in arithmetic progression.

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers to check AP (Ex., a b c): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(2*b == (a + c)) {
            System.out.println(a+ " "+b+" and "+ c+ " are in arithmetic progression");
        } else {
            System.out.println(a+ " "+b+" and "+ c+ " are not in arithmetic progression");
        }
    }
}
