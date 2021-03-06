package sorting;

public class MergeSort {
    private static void merge(int[] arr, int[] temp, int low, int high){
        if (low < high) {
            int mid = (low + high) / 2;
            merge(arr, temp, low, mid);
            merge(arr, temp, mid + 1, high);

            for (int i = low, j = mid + 1, k = low; k <= high; k++) {
                if (i == mid + 1)   temp[k] = arr[j++];
                else if (j == high + 1) temp[k] = arr[i++];
                else if (arr[i] < arr[j])   temp[k] = arr[i++];
                else temp[k] = arr[j++];
            }

            for (int k = low; k <= high; k++)
                arr[k] = temp[k];
        }
    }
    public static int[] sort(int[] arr) {
        int lower = 0;
        int higher = arr.length - 1;
        int[] temp = new int[arr.length];
        merge(arr, temp, lower, higher);

        return arr;
    }
}
