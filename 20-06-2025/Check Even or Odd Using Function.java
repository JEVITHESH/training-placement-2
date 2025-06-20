

public class EvenOdd {
    static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static void main(String[] args) {
        System.out.println("7 is " + (isEven(7) ? "Even" : "Odd"));
    }
}
