package SortingAlgorithms.SelectionSortAlgorithm;

public class SelectionSortAlgorithm {

    static void selectionSort (int[] arr, int N) {
        for (int i = 0; i < N-1; i++) {
            int smallestIndex = i;
            for (int j = i; j < N; j++) {
                if(arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int N = 6;
        int[] arr = {3,2,3,4,6,5};

        selectionSort(arr, N);

        System.out.println("Sorted Array: O(n^2)");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
