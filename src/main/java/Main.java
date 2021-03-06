import sorting.BubbleSort;
import sorting.MergeSort;
import sorting.QuickSort;
import sorting.SelectionSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {44, 11, 243, 32432, 30, 1, 8, 78, 292};
        arr = QuickSort.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
