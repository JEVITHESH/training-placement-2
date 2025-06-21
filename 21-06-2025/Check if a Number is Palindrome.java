

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121, rev = 0, temp = num;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println(num + " is " + (num == rev ? "Palindrome" : "Not Palindrome"));
    }
}
