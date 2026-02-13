package DSA_Logic_Building.Step1_ConditionalThinking._5_CreativeTrickyLogicalScenarios;

import java.util.Scanner;

// 10. Take a year and print the corresponding century (e.g., “19th century”, “20th century”)
public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        if(year > 1900 && year < 1999) {
            System.out.println("20th Century");
        } else if (year > 2000 && year < 2199) {
            System.out.println("21th Century");
        } else {
            System.out.println("Enter valid year");
        }
    }
}
