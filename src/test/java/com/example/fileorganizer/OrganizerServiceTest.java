package com.example.fileorganizer;

import org.junit.jupiter.api.Test;
import java.nio.file.Path;

public class OrganizerServiceTest {
    @Test
    public void smokeTest() {
        OrganizerService s = new OrganizerService();
        s.organize(Path.of("."));
    }
}
