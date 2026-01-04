package DSA_Logic_Building.Step1_ConditionalThinking._3_MathAndNumberLogic;

import java.util.Scanner;

// 9. Take two angles of a triangle and compute the third angle.
public class Question9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first angle in degree: ");
        int first_angle = scanner.nextInt();

        System.out.print("Enter second angle in degree: ");
        int second_angle = scanner.nextInt();

        int third_angle = 180 - first_angle - second_angle;
        System.out.print("Third angle in degree: "+ third_angle);
    }
}
