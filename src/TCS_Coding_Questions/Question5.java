package TCS_Coding_Questions;

import java.util.Scanner;

// Given a string you have to count vowels, consonants ,digits and special character in it
// S is string
// Constraints:
// S should be greater than zero and consists of lowercase english letter and does not contains spaces
public class Question5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String S = scanner.next().toLowerCase();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int specialChar = 0;

        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i) >= 'a' && S.charAt(i) <= 'z') {
                if(S.charAt(i) == 'a' || S.charAt(i) == 'e' || S.charAt(i) == 'i'|| S.charAt(i) == 'o' || S.charAt(i) == 'u') {
                    vowels += 1;
                } else {
                    consonants += 1;
                }
            } else if(S.charAt(i) >= '0' && S.charAt(i) <= '9' ) {
                digits += 1;
            } else {
                specialChar += 1;
            }
        }

        System.out.println("Vowels: "+ vowels);
        System.out.println("Consonants: "+ consonants);
        System.out.println("Digits: "+ digits);
        System.out.println("Special Characters: "+ specialChar);
    }
}
