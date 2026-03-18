package SortingAlgorithms.QuickSortAlgorithm;

public class QuickSortAlgorithm {

    static int partition(int[] arr, int start, int end) {
        int pivote = arr[end];
        int pivotIndex = start-1;

        for(int i = start; i < end; i++) {
            if(pivote >= arr[i]) {
                pivotIndex++;
                int temp = arr[i];
                arr[i] = arr[pivotIndex];
                arr[pivotIndex] = temp;
            }
        }

        pivotIndex++;
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[end];
        arr[end] = temp;

        return pivotIndex;
    }

    static void quickSort(int[] arr, int start, int end) {
        if( start < end) {
            int pivotIndex = partition(arr, start, end);

            quickSort(arr, start, pivotIndex-1);
            quickSort(arr, pivotIndex+1, end);
        }
    }


    public static void main(String[] args) {
        int N = 6;
        int[] arr = {4,2,1,3,6,4};

        quickSort(arr, 0, 5);

        // Time Complexity:
        // Best: O(n log n)
        // worst: O(n^2)

        System.out.println("Sorted Array:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
