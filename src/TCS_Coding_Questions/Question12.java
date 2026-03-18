package TCS_Coding_Questions;

// Minimum Bit Flips to Convert Number

// A bit flip of a number x is choosing a bit in the binary representation of x and flipping it from either O to 1 or 1 to O.

// For example, for x = 7, the binary representation is 111 and we may choose any bit (including any leading zeros not shown)
// and flip it. We can flip the first bit from the right to get 110, flip the second bit from the right to get 101,
// flip the fifth bit from the right (a leading zero) to get 10111, etc.

// Given two integers start and goal, return the minimum number of bit flips to convert start to goal.
// Input: start = 1O, goal = 7
// Output: 3

public class Question12 {

    public static void main(String[] ags) {

        int start = 10;
        int goal = 9;

        int XOR = start ^ goal; // give no of iteration as n0. of 1s in binary form

//        System.out.print("Output: "+ Integer.bitCount(XOR)); // if bitCount() method is not allow

        // Count the 1s in binary number
        int count = 0;

        while (XOR != 0) {
             XOR = XOR & (XOR - 1);
             count++;
        }

        System.out.print("Output: "+ count);
    }
}
