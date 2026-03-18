package SortingAlgorithms.MergeSortAlgorithm;

public class MergeSortAlgorithm {

    static void merge(int[] arr, int start, int mid, int end) {

        int[] temp_arr = new int[end - start +1];
        int index = 0;
        int i = start, j = mid+1;

        while(i <= mid && j <= end) {
            if(arr[i] <= arr[j]) {
                temp_arr[index] = arr[i];
                index++;
                i++;
            } else {
                temp_arr[index] = arr[j];
                index++;
                j++;
            }
        }

        while(i <= mid) {
            temp_arr[index] = arr[i];
            index++;
            i++;
        }

        while(j <= end) {
            temp_arr[index] = arr[j];
            index++;
            j++;
        }

        for(int k = 0; k < temp_arr.length; k++) {
            arr[start+k] = temp_arr[k];
        }
    }

    static void mergeSort(int[] arr, int start, int end) {
        if(start < end) {
            int mid = start + (end - start)/2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);

            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        int N = 6;
        int[] arr = {3,2,3,4,6,5};

        mergeSort(arr, 0, N-1);

        System.out.println("Sorted Array: O(n^2)");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
