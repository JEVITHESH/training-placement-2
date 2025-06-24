

public class SumEvenOdd {
    public static void main(String[] args) {
        int[] arr = {10, 13, 24, 33, 45};
        int evenSum = 0, oddSum = 0;
        for (int n : arr) {
            if (n % 2 == 0) evenSum += n;
            else oddSum += n;
        }
        System.out.println("Even Sum: " + evenSum + ", Odd Sum: " + oddSum);
    }
}
