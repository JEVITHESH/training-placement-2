

public class ArmstrongRange {
    public static void main(String[] args) {
        for (int num = 100; num <= 999; num++) {
            int sum = 0, temp = num;
            while (temp != 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }
            if (sum == num)
                System.out.println(num + " is Armstrong");
        }
    }
}
