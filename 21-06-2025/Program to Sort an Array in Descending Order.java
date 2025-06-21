

import java.util.Arrays;
import java.util.Collections;

public class DescendingSort {
    public static void main(String[] args) {
        Integer[] arr = {4, 2, 8, 1, 9};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Sorted: " + Arrays.toString(arr));
    }
}
