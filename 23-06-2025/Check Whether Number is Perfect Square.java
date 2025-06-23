

public class PerfectSquare {
    public static void main(String[] args) {
        int num = 49;
        int sqrt = (int)Math.sqrt(num);
        if (sqrt * sqrt == num)
            System.out.println("Perfect Square");
        else
            System.out.println("Not a Perfect Square");
    }
}
