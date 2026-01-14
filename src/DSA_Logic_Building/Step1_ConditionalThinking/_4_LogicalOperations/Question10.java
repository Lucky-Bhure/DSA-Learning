package DSA_Logic_Building.Step1_ConditionalThinking._4_LogicalOperations;

import java.util.Scanner;

// 10. Take a password string and check basic rules (length ≥ 8 and contains at least one digit).
public class Question10 {

    static boolean checkPassword(String password) {
            boolean isLengthCheck = password.length() >= 8;
            boolean isContainNumber = false;

            for(char p : password.toCharArray()) {
                if(Character.isDigit(p)) {
                    isContainNumber = true;
                }
            }
        return isLengthCheck && isContainNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if(checkPassword(password)) {
            System.out.print("Enter password is valid");
        } else {
            System.out.print("Enter password is not valid");
        }
    }
}
