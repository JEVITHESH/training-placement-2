

public class GeneralArmstrong {
    public static void main(String[] args) {
        int num = 9474, temp = num, sum = 0;
        int digits = String.valueOf(num).length();
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        System.out.println(num + " is " + (num == sum ? "Armstrong" : "Not Armstrong"));
    }
}
