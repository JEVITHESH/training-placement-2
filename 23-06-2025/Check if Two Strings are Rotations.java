

public class StringRotation {
    public static void main(String[] args) {
        String s1 = "ABCD", s2 = "CDAB";
        if (s1.length() == s2.length() && (s1 + s1).contains(s2))
            System.out.println("Strings are rotations");
        else
            System.out.println("Not rotations");
    }
}
