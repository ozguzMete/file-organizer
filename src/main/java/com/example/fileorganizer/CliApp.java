package com.example.fileorganizer;

    import java.nio.file.Paths;

    /**
     * Simple CLI wrapper for demonstration.
     */
    public class CliApp {
        private final OrganizerService service = new OrganizerService();

        public void run(String[] args) {
            String path = args.length > 0 ? args[0] : ".";
            System.out.println("Scanning: " + path);
            service.organize(Paths.get(path));
        }
    }
