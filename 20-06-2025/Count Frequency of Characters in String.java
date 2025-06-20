

import java.util.HashMap;
public class CharFrequency {
    public static void main(String[] args) {
        String str = "programming";
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        System.out.println(freq);
    }
}
