

public class WordCount {
    public static void main(String[] args) {
        String sentence = "Java is fun and powerful";
        String[] words = sentence.trim().split("\\s+");
        System.out.println("Word count: " + words.length);
    }
}
