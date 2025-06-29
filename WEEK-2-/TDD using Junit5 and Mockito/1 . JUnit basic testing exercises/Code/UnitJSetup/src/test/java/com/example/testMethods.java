package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class testMethods {

    methods m = new methods();

    @Test
    public void testAdd() {
        assertEquals(7, m.add(3, 4));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, m.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, m.multiply(3, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(5, m.divide(10, 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        m.divide(10, 0);
    }
}
