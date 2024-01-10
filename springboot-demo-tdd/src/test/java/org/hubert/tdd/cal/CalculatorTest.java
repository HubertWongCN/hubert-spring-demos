package org.hubert.tdd.cal;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

/**
 * @author hubertwong
 */
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAddInt() {
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    public void testAddIntOverflow() {
        assertThrows(ArithmeticException.class, () -> calculator.add(Integer.MAX_VALUE, 1));
    }
}
