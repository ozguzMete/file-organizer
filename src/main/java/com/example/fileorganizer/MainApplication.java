package com.example.fileorganizer;

    /**
     * Main entrypoint for the File Organizer utility.
     */
    public class MainApplication {
        public static void main(String[] args) {
            System.out.println("File Organizer Utility - starting...");
            CliApp app = new CliApp();
            app.run(args);
        }
    }
