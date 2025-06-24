

public class CaseCounter {
    public static void main(String[] args) {
        String str = "JavaProgramming123";
        int upper = 0, lower = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) upper++;
            else if (Character.isLowerCase(ch)) lower++;
        }
        System.out.println("Uppercase: " + upper + ", Lowercase: " + lower);
    }
}
