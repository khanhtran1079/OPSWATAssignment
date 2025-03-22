package com.opswat.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WordAnalyseResult {
    private long wordFrequencyNumber;
    private double wordFrequencyPercentage;
}
