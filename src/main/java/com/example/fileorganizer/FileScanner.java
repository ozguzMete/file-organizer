package com.example.fileorganizer;

    import java.nio.file.*;
    import java.io.IOException;
    import java.util.ArrayList;
    import java.util.List;

    /**
     * Scans a directory and returns simple file representations.
     */
    public class FileScanner {
        public List<ScannedFile> scan(Path root) {
            List<ScannedFile> out = new ArrayList<>();
            try {
                Files.walk(root)
                    .filter(Files::isRegularFile)
                    .forEach(p -> out.add(new ScannedFile(p)));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return out;
        }
    }
