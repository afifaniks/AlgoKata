package sorting;

public class SelectionSort {
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int swap = arr[j];
                    arr[j] = arr[i];
                    arr[i] = swap;
                }
            }
        }

        return arr;
    }
}
