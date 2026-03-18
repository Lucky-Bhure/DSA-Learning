package TCS_Coding_Questions;

//  Given an array consists of n elements you have to print the elements which has appeared even number of times
//  a) N size of array
//  b) Next line contains elements of array
//  Print the elements which has appeared even number of times

//  Constraints:
//  Size of array should be greater than zero
//  Elements of array should be greater than zero

// Example:
// input 1: [1,2,3,2,3,4]
// output 1: [2,3]

// input 2: [1,2,3,4,4,4,4]
// output 1: [4]

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many number you want to enter: ");
        int N = scanner.nextInt();

        int[] arr = new int[N];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        ArrayList<Integer> result = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < N; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
//          map.put(key, map.getOrDefault(arr[i], 0)+1 -> value);
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() % 2 == 0) {
                result.add(entry.getKey());
            }
        }

        System.out.println("Output: " + result.toString());
    }
}
