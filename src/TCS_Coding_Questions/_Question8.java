package TCS_Coding_Questions;


// Problem 1: Array Pair Sum
// Description: Given an array of N integers and a target sum K, find all unique pairs whose sum equals K.
// Constraints: 1 ≤ N ≤ 10^5
// Input Format:
// First line: N
// Second line: N integers
// Third line: K
// Output Format:
// Print all pairs whose sum equals K.
// Example Input:
//        6
//        1 5 7 -1 5 3
//        6
// Example Output:
//        1 5 7 -1

import java.util.HashSet;
import java.util.Scanner;

public class _Question8 {

    static void uniquePairs(int[] arr, int N, int sum) {

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < N; i++) {

            int complement = sum - arr[i];

            if(set.contains(complement)) {
                System.out.println(complement + " " + arr[i]);
            }

            set.add(arr[i]);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many number you want to enter: ");
        int N = scanner.nextInt();

        int[] arr = new int[N];

        System.out.println("Enter your numbers: ");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("How much sum should be: ");
        int sum = scanner.nextInt();

        uniquePairs(arr, N, sum);

    }
}
