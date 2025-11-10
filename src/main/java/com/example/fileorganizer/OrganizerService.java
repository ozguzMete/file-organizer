package com.example.fileorganizer;

    import java.nio.file.Path;
    import java.util.List;

    /**
     * High-level orchestration of the file organizing process.
     */
    public class OrganizerService {
        private final FileScanner scanner = new FileScanner();
        private final RuleEngine rules = new RuleEngine();
        private final FileMover mover = new FileMover();

        public void organize(Path root) {
            List<ScannedFile> files = scanner.scan(root);
            for (ScannedFile f : files) {
                Path dest = rules.decideDestination(f);
                mover.moveTo(f, dest);
            }
        }
    }
