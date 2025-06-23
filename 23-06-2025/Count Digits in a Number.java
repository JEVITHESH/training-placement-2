

public class CountDigits {
    public static void main(String[] args) {
        int num = 123456, count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println("Digit count: " + count);
    }
}
