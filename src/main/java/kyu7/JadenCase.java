package kyu7;

import java.util.StringJoiner;

public class JadenCase {
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.length() == 0) {
            return null;
        }
        final StringJoiner sj = new StringJoiner(" ");
        final String[] words = phrase.split(" ");
        for (final String word : words) {
            sj.add(word.substring(0, 1).toUpperCase() + word.substring(1));
        }
        return sj.toString();
    }
}