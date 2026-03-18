package TCS_Coding_Questions;

//  Given a non-empty array of integers nums, every element appears twice except for one. Find that sir=one.
//  You must implement a solution with a linear runtime complexity and use only constant extra space.
//  Input: [2,2,1]
//  Output: 1
//  Input: [4,1,2,1,2]
//  Output: 4

// Time Complexity = O(n)
// Space Complexity = O(1)


import java.util.HashMap;

public class Question11 {
    public static void main(String[] args) {

        int[] arr = {4,1,5,4,5};
        int N = arr.length;

//        TC=O(n)  SC=O(n)
//        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
//
//        for (int i = 0; i < N; i++) {
//            hash.put(arr[i], hash.getOrDefault(arr[i], 0)+1);
//        }
//
//        int result = 0;
//
//        for (int i = 0; i < N; i++) {
//            if(hash.get(arr[i]) == 1) {
//                result = arr[i];
//                break;
//            }
//        }
//
//        System.out.println(hash);
//        System.out.print("Output: "+ result);

        int XOR = 0;

        for (int j : arr) {
            XOR = XOR ^ j;
        }

        System.out.print("Output: "+ XOR);
//      TC= O(n)
//      SC= O(1)

    }
}
