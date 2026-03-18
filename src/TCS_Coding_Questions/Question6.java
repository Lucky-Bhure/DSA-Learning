package TCS_Coding_Questions;

// A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array of N number of integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).
// Example 1 •
// N= 8 and arr = [4,5,0,1,9,0,5,0]
// There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array
// Input: 8 - Value of N

// [4,5,0,1,9,0,5,0]— Element of arr[Ol to arr[N-1],While input each element is separated by newline

// Output: 4 5 1 9 5 0 0 0

// Space Complexity: O(1)
// Time Complexity: O(n)

public class Question6 {

    static void findPackets(int[] arr,int N) {
        int j = -1;
        for (int i = 0; i < N; i++) {
            if(arr[i] == 0) {
                j = i;
                break;
            }
        }
        if(j == -1) return;
        for(int i= j + 1; i < N; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {

        int N = 8;
        int[] arr = {4,5,0,1,9,0,5,0};

        findPackets(arr, N);

        for(int i: arr) {
            System.out.print(i+" ");
        }

    }
}
