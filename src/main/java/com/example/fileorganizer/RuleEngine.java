package com.example.fileorganizer;

    import java.nio.file.Path;
    import java.nio.file.Paths;

    /**
     * Very small rule engine deciding destination folders.
     */
    public class RuleEngine {
        public Path decideDestination(ScannedFile f) {
            String name = f.getFileName().toLowerCase();
            if (name.endsWith(".jpg") || name.endsWith(".png")) {
                return Paths.get("sorted/images");
            } else if (name.endsWith(".mp3") || name.endsWith(".wav")) {
                return Paths.get("sorted/audio");
            } else if (name.endsWith(".txt") || name.endsWith(".md")) {
                return Paths.get("sorted/text");
            } else {
                return Paths.get("sorted/misc");
            }
        }
    }
