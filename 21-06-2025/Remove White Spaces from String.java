

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "Java Programming Language";
        String result = str.replaceAll("\\s", "");
        System.out.println("Without spaces: " + result);
    }
}
