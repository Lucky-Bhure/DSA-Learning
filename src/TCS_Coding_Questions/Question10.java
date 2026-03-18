package TCS_Coding_Questions;


// Airport security officials have confiscated several item Of the passengers at the security check point.
// All the items have been dumped into a huge box (array). Each item possesses a certain amount of Here,
// the risk severity of the items represent an array[] of N number of integer values.
// The task here is to sort the items based on their levels of risk in the array. The risk values range from 0 to 2.

// Example:
// Input :
// 7 -> Value of N
// [1,0,2,0,1,0,2] -> Element of arr[0] to arr[N-1], while input each element is separated by new line.
// Output:
// 0001122 -> Element after sorting based on risk severity

// Time Complexity: O(n)
// Space Complexity: O(1)

public class Question10 {
    public static void main(String[] args) {

        int[] array = {1,0,2,0,1,3,0,2,2,1,2,1};

        int zero = 0;
        int one = 0;
        int two = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0) {
                zero++;
            } else if (array[i] == 1) {
                one++;
            } else if(array[i] == 2) {
                two++;
            } else {
                System.out.print("Invalid Input: "+ array[i]);
                System.exit(1);
            }
        }

        int i = 0;

        for (int j = 0; j < zero; j++) {
            array[i] = 0;
            i++;
        }
        for (int j = 0; j < one; j++) {
            array[i] = 1;
            i++;
        }
        for (int j = 0; j < two; j++) {
            array[i] = 2;
            i++;
        }

        System.out.print("Output: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
        }
    }
}
