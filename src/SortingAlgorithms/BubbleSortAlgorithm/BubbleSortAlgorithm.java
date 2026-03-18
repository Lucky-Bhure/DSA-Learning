package SortingAlgorithms.BubbleSortAlgorithm;

public class BubbleSortAlgorithm {

    static void bubbleSort(int[] arr, int N) {
        for(int i = 0; i < N-1; i++) {
            boolean isSwap = false;
            for (int j = 0; j < N - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwap=true;
                }
            }
            if(!isSwap) {
                break;
            }
        }
    }



    public static void main(String[] args) {
        int N = 6;
        int[] arr = {53,26,33,14,22,11};

        bubbleSort(arr, N);

        System.out.println("Sorted Array: O(n^2)");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
