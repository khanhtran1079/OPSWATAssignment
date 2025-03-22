package com.opswat.part1;

import com.opswat.common.processors.ReportGenerator;

import java.io.IOException;

public class Part1 {
    public static void main(String[] args) throws IOException {
        String filePath = "src/main/resources/part1/sample.txt";
        ReportGenerator.reportToConsoleString(filePath);

        //wrong anwser for part 1: I found 17 unique words NOT 15 (already checked multiple times)
    }
}
