package DSA_Logic_Building.Step1_ConditionalThinking._2_MultipleConditions;


// 1.  Take three sides and check if they form a valid triangle.
// Valid Triangle: If the sum of any two sides of triangle must be greater than third side.
// (a + b > c) && (a + c > b) && (b + c > a);           a, b, c are sides of a triangle

import java.util.Scanner;

public class Question1 {

    static boolean isTriangle (int side1, int side2, int side3) {
        return side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first side length: ");
        int side1 = scanner.nextInt();
        System.out.print("Enter second side length: ");
        int side2 = scanner.nextInt();
        System.out.print("Enter third side length: ");
        int side3 = scanner.nextInt();

        if(isTriangle(side1,side2,side3))
            System.out.print("It is a valid triangle");
        else
            System.out.print("It is not a valid triangle");
    }
}
