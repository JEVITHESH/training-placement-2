

public class PrimeOrComposite {
    public static void main(String[] args) {
        int num = 10;
        if (num <= 1) {
            System.out.println("Neither prime nor composite");
        } else {
            boolean prime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            System.out.println(prime ? "Prime" : "Composite");
        }
    }
}
