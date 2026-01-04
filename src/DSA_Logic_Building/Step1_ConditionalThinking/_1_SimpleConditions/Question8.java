package DSA_Logic_Building.Step1_ConditionalThinking._1_SimpleConditions;

import java.util.Scanner;

// 8. Take a temperature value and print "Freezing",“Cold”, “Warm”, or “Hot” using range conditions.
public class Question8 {

    static String isTemperature(int temp) {
        if (temp <= 0)
            return "Freezing";
        else if ( temp <= 10 )
            return "Cold";
        else if ( temp <= 27 ) {
            return "Warm";
        } else {
            return "Hot";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        int temp = scanner.nextInt();
        System.out.print("Temperature is " + isTemperature(temp));
    }
}
