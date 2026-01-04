package DSA_Logic_Building.Step1_ConditionalThinking._2_MultipleConditions;

import java.util.Scanner;

import static DSA_Logic_Building.Step1_ConditionalThinking._2_MultipleConditions.Question1.isTriangle;

// 2.  If the sides form a valid triangle, determine whether it is equilateral, isosceles, or scalene.
// Equilateral Triangle -> All sides are of same length
// Isosceles Triangle -> Two sides are same and one is different
// Scalene Triangle -> All sides are different

public class Question2 {
    static String typeOfTriangle (int side1, int side2, int side3) {
        if( side1 == side2 && side2 == side3) {
            return "Equilateral";
        }
        else if(side1 == side2 || side1 == side3 || side2 == side3) {
            return "Isosceles";
        }
        return "Scalene";
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
            System.out.print("It is a "+ typeOfTriangle(side1, side2, side3)+ " triangle.");
        else
            System.out.print("It is not a valid triangle");
    }
}
