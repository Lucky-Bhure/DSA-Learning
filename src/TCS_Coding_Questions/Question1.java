package TCS_Coding_Questions;

// Zoo consists Of two types of animals with different number of legs. The zoo management wants to find out how many type of animals are their with each category,

// • N represents the total number of animals
// • L represents the total number Of Legs

// Find out the number of animals of each category

// Constraints:
// There are only two type of animals two legs and four legs animals
// N and L Should be greater than Zero
// L>=2, L%2=0, N<L

// Input Format:
//  1) The first line of input contains the value N represents the sum of both types of animals
//  2) The second line of input contains value L represents total number of Legs

//  Output Format:
//  Print the number of animals of each category (two legs & four legs)
//  If input is not Valid print Invalid input

//  Sample Input 1:
//  N=200
//  L=540
//  Sample Output 1:
//  TL=130
//  FL=70

import java.util.Scanner;

public class Question1 {

    static void display(int N, int L) {
        if( L%2!=0 && N>L && N < 0) {
            System.out.println("Invalid Input");
        } else {

            // Explanation: x + y = N and 2x + 4y = L
            // x -> 2 legs animals
            // y -> 4 legs animals

            // Number of 2 Legs animals
            int x = (4*N - L)/2;

            // Number of 4 Legs animals
            int y = (N-x);

            if(x < 0 || y < 0) {
                System.out.println("Invalid Input");
            } else {
                System.out.println("2L: "+ x);
                System.out.println("4L: "+ y);
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total number of animals: ");
        int N = scanner.nextInt();
        System.out.print("Enter total number of legs: ");
        int L = scanner.nextInt();

        display(N, L);

        scanner.close();

    }
}
