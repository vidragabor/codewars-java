package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MultiplyTest {

    private static final int DELTA = 10 - 15;

    @Test
    public void testSimpleMultiply() {
        assertEquals(0d, Multiply.multiply(0d, 5d), DELTA);
        assertEquals(10d, Multiply.multiply(2d, 5d), DELTA);
    }

    @Test
    public void testNullValue() {
        assertNull(Multiply.multiply(null, 5d));
        assertNull(Multiply.multiply(2d, null));
        assertNull(Multiply.multiply(null, null));
    }
}