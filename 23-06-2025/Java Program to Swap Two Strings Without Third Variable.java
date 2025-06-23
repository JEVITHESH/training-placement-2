

public class SwapStrings {
    public static void main(String[] args) {
        String a = "Hello", b = "World";
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("a: " + a + ", b: " + b);
    }
}
