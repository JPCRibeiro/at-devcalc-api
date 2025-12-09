package com.jpribeiro;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {
    CalculatorService service = new CalculatorService();

    @Test
    void testAdd() {
        assertEquals(24, service.add(18, 6));
    }

    @Test
    void testSubtract() {
        assertEquals(-5, service.subtract(5, 10));
    }

    @Test
    void testMultiply() {
        assertEquals(39, service.multiply(13, 3));
    }

    @Test
    void testDivide() {
        assertEquals(16, service.divide(64, 4));
    }
}
