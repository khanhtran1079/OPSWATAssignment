package com.opswat.common.processors;

import com.opswat.common.dto.WordAnalyseResult;
import com.opswat.common.utilities.FileUtil;
import com.opswat.common.utilities.StringUtil;

import java.io.IOException;
import java.util.Map;
import java.util.Set;


public class ReportGenerator {
    public static void reportToConsoleString(String filePath) throws IOException {
        String content = StringUtil.normalizeString(FileUtil.readFileToString(filePath));
        long totalWordsCount = StringUtil.countTotalWords(content);
        Set<String> wordsSet = StringUtil.createWordSetFromString(content);
        Map<String, WordAnalyseResult> resultMap = TextAnalyser.analyseText(content);
        Map<String, WordAnalyseResult> top5Map = TextAnalyser.getTopFive(resultMap);
        StringBuilder reportForTop5MostFrequentWordsBuilder = new StringBuilder();
        top5Map.forEach((key, item) -> reportForTop5MostFrequentWordsBuilder.append(String.format("%s - %d (%.2f%%)%n", key, item.getWordFrequencyNumber(), item.getWordFrequencyPercentage())));
        String reportString = """
                Total Word Count: %d
                Top 5 Most Frequent Words:
                %s
                Number of Unique Words: %d
                """.formatted(totalWordsCount, reportForTop5MostFrequentWordsBuilder.toString(), wordsSet.size());
        System.out.println(reportString);
    }
}
