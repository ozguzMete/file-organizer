package com.example.fileorganizer;

    import java.nio.file.*;
    import java.io.IOException;

    /**
     * Moves files to destination folders (creates folders if necessary).
     */
    public class FileMover {
        public void moveTo(ScannedFile f, Path destDir) {
            try {
                Path targetDir = destDir;
                if (!Files.exists(targetDir)) {
                    Files.createDirectories(targetDir);
                }
                Path target = targetDir.resolve(f.getPath().getFileName());
                Files.move(f.getPath(), target, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Moved " + f.getPath() + " -> " + target);
            } catch (IOException e) {
                System.err.println("Failed to move " + f.getPath() + ": " + e.getMessage());
            }
        }
    }
