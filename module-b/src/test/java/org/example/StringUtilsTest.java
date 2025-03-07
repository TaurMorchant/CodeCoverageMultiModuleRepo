package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void valueOf() {
        assertEquals("10", StringUtils.valueOf(10));
    }
}