package com.example.fileorganizer;

    import java.nio.file.Path;

    /**
     * Lightweight representation of a scanned file.
     */
    public class ScannedFile {
        private final Path path;

        public ScannedFile(Path path) {
            this.path = path;
        }

        public Path getPath() {
            return path;
        }

        public String getFileName() {
            return path.getFileName().toString();
        }
    }
