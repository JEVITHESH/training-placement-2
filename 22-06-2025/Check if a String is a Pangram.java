

public class PangramCheck {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        boolean[] alphabet = new boolean[26];
        for (char ch : str.toCharArray()) {
            alphabet[ch - 'a'] = true;
        }
        for (boolean b : alphabet) {
            if (!b) {
                System.out.println("Not a Pangram");
                return;
            }
        }
        System.out.println("Pangram");
    }
}
