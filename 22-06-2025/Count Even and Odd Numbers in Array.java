

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30};
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even + ", Odd: " + odd);
    }
}
