

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        for (int num : arr) System.out.print(num + " ");
    }
}
