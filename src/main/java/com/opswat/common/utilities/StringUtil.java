package com.opswat.common.utilities;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringUtil {
    public static long countTotalWords(String content) {
        return Arrays.stream(content.split(" "))
                .filter(word -> !word.isBlank())
                .count();
    }

    public static Set<String> createWordSetFromString(String content) {
        return new HashSet<>(Arrays.stream(content.split(" ")).toList());
    }

    public static long countWordFrequency(String content, String word) {
        if (content == null || word == null || word.isBlank()) {
            return 0;
        }

        return Arrays.stream(content.split(" "))
                .filter(w -> w.equals(word.toLowerCase()))
                .count();
    }

    public static String normalizeString(String content) {
        return content.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
    }
}
