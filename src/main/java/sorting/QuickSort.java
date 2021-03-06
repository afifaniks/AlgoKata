package sorting;

public class QuickSort {
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
        }

        int swap = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = swap;

        return (i + 1);
    }

    private static void qSort(int[] arr, int low, int high) {
        if (low < high) {
            int part = partition(arr, low, high);
            qSort(arr, low, part - 1);
            qSort(arr, part, high);
        }
    }

    public static int[] sort(int[] arr) {
        int lower = 0;
        int higher = arr.length - 1;

        qSort(arr, lower, higher);

        return arr;
    }
}
