package com.opswat.common.processors;

import com.opswat.common.dto.WordAnalyseResult;
import com.opswat.common.utilities.StringUtil;

import java.util.*;
import java.util.stream.Collectors;

public class TextAnalyser {
    public static Map<String, WordAnalyseResult> analyseText(String content) {
        Map<String, WordAnalyseResult> result = new HashMap<>();
        Set<String> wordsSet = StringUtil.createWordSetFromString(content);
        long totalWordsCount = StringUtil.countTotalWords(content);
        Iterator<String> iterator = wordsSet.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            long wordCount = StringUtil.countWordFrequency(content, word);
            double wordFrequencyPercentages = calcWordFrequencyPercentages(wordCount, totalWordsCount);
            WordAnalyseResult wordAnalyseResult = new WordAnalyseResult();
            wordAnalyseResult.setWordFrequencyNumber(wordCount);
            wordAnalyseResult.setWordFrequencyPercentage(wordFrequencyPercentages);
            result.put(word, wordAnalyseResult);
        }
        return result;
    }

    public static Map<String, WordAnalyseResult> getTopFive(Map<String, WordAnalyseResult> wordsMap) {
        return wordsMap.entrySet()
                .stream()
                .sorted(Comparator.comparingLong(
                        (Map.Entry<String, WordAnalyseResult> item) -> item.getValue().getWordFrequencyNumber()).reversed())
                .limit(5)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (existing, replacement) -> existing,
                        LinkedHashMap::new
                ));
    }

    static double calcWordFrequencyPercentages(long wordCount, long totalWordsCount) {
        if (totalWordsCount == 0) {
            throw new ArithmeticException("Division By Zero Error: totalWordsCount is 0");
        }
        return (wordCount * 100.0) / totalWordsCount;
    }
}
