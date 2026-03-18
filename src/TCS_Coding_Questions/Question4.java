package TCS_Coding_Questions;

// Given a number in you have to toggle all its bits in binary form toggle means change 1 to O and vice versa and print the number after toggling the bit
//a) N is the number
//Constraints:
//N should be greater than zero

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int N = scanner.nextInt();
//        String binary = "";

        if(N < 0) {
            System.out.println("Enter valid number");
            System.exit(0);
        }

//        if(N == 0) {
//            binary = "1";
//        } else {
//            while( N > 0) {
//                int remainder = N%2;
//
//                if(remainder == 1) {
//                    remainder = 0;
//                } else {
//                    remainder = 1;
//                }
//
//                binary = remainder + binary;
//
//                N /=2;
//            }
//        }

        String binary = Integer.toBinaryString(N);
        StringBuilder newBinary = new StringBuilder();

        for (int i = 0; i < binary.length(); i++) {
                if(binary.charAt(i) == '0') {
                newBinary.append('1');
            } else {
                newBinary.append('0');
            }
        }

        System.out.println("Binary Number: "+ newBinary);






    }
}
