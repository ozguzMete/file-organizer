package com.example.fileorganizer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilsTest {
    @Test
    public void truncateWorks() {
        assertEquals("hi", Utils.truncate("hi", 5));
        assertEquals("lo...", Utils.truncate("loremipsum", 5));
    }
}
