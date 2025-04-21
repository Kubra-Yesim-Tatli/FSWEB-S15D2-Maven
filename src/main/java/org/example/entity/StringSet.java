package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class StringSet {
    // Parametre alan metod
    public static Set<String> findUniqueWords(String text) {
        Set<String> uniqueWords = new HashSet<>();
        String[] words = text.split("\\s+");
        for (String word : words) {
            uniqueWords.add(word.toLowerCase().replaceAll("[^a-zA-Z]", ""));
        }
        return uniqueWords;
    }
}
