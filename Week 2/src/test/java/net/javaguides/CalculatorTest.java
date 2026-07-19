package net.javaguides;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void addTest() {
        calc c = new calc();
        int result = c.add(10, 20);
        assertEquals(30, result);
    }
}