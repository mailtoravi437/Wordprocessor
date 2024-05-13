package org.example;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
    static Map<Character,Letter> letterMap = new HashMap<>();

    public static Letter getLetter(char c, String font, int fontSize) {
        if(letterMap.containsKey(c)) {
            return letterMap.get(c);
        } else {
            Letter letter = new Letter(c, font, fontSize);
            letterMap.put(c, letter);
            return letter;
        }
    }
}
