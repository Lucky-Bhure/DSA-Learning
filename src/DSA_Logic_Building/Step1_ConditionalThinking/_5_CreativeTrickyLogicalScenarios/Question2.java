package DSA_Logic_Building.Step1_ConditionalThinking._5_CreativeTrickyLogicalScenarios;

import java.util.Scanner;

// 2. Take three numbers and check if they can form a Pythagorean triplet.
public class Question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        if(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {
            System.out.print("Number are Pythagorean triplet");
        } else {
            System.out.print("Number are not Pythagorean triplet");
        }
    }

}
