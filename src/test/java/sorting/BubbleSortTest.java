package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @DisplayName("Should test array equal")
    @Test
    void mergeSort() {
        int arr[] = {5, 9, 8, 1, -7};
        int sorted[] = {-7, 1, 5, 8, 9};

        Assertions.assertArrayEquals(sorted, BubbleSort.sort(arr));
    }
}