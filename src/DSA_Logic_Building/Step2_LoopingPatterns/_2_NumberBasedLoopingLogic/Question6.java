package DSA_Logic_Building.Step2_LoopingPatterns._2_NumberBasedLoopingLogic;

import java.util.Scanner;

// 6. Check if a number is a perfect number.
public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        String str = scanner.nextLine();

        for(int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                System.out.println(str+" is not a perfect number");
                System.exit(0);
            }
        }
        
        System.out.println(str+" is a perfect number");



    }
}
