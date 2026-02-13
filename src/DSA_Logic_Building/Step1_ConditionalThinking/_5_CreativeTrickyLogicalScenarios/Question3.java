package DSA_Logic_Building.Step1_ConditionalThinking._5_CreativeTrickyLogicalScenarios;


import java.util.Scanner;

// 3. Take day and month and check if it forms a valid calendar date (ignoring leap years).
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        if(day < 1 || day > 31) {
            System.out.println("Enter Valid day");
        }

        System.out.print("Enter Month: ");
        int month = scanner.nextInt();

         if(month < 1 || month > 12) {
            System.out.println("Enter Valid month");
        }

        if(day >= 1 && day <= 31 && month >= 1 && month <= 12){
            System.out.print(day + "/"+month+ " is a valid calender date.");
        }
    }
}
