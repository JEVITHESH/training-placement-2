

public class CheckNumeric {
    public static void main(String[] args) {
        String str = "12345";
        boolean isNumeric = str.matches("\\d+");
        System.out.println("Is numeric: " + isNumeric);
    }
}
