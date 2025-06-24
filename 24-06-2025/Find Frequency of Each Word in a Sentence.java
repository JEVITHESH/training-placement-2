

import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "Java is easy and Java is powerful";
        String[] words = sentence.toLowerCase().split("\\s+");
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words)
            map.put(word, map.getOrDefault(word, 0) + 1);
        System.out.println(map);
    }
}
