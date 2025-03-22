package com.opswat.common.utilities;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtil {
    public static String readFileToString(String filePath) throws IOException {
        return Files.readString(Path.of(filePath), StandardCharsets.UTF_8);
    }
}
