package SortingAlgorithms.InsertionSortAlgorithm;

public class InsertionSortAlgorithm {

    static void insertionSort(int[] arr, int N) {
        for (int i = 0; i < N; i++) {
            int curr = arr[i];
            int prev = i-1;

            while(prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }

    }

    public static void main(String[] args) {
        int N = 6;
        int[] arr = { 3, 1, 2, 7, 4, 6, 5};

        insertionSort(arr, N);

        System.out.println("Sorted Array: O(n^2)");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
