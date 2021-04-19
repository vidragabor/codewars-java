package kyu6;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
    private static final String ONCE = "(";
    private static final String MORE = ")";

    static String encode(String word) {
        if (word == null || word.length() == 0) {
            return null;
        }

        String phrase = word.toLowerCase();

        Map<Character, Integer> charMap = new HashMap<>();
        for (char character : phrase.toCharArray()) {
            int counter = charMap.getOrDefault(character, 0);
            charMap.put(character, ++counter);
        }

        StringBuilder output = new StringBuilder();
        for (char character : phrase.toCharArray()) {
            output.append(charMap.get(character) == 1 ? ONCE : MORE);
        }
        return output.toString();
    }
}