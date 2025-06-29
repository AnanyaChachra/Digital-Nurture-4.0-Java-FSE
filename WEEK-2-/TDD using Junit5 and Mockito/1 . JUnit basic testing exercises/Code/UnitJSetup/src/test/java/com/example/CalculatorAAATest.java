package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorAAATest {

    private methods m;

    @Before
    public void setUp() {
        m = new methods(); 
        System.out.println("Setup: Calculator instance created");
    }

    @After
    public void tearDown() {
        m = null;
        System.out.println("Teardown: Calculator instance destroyed");
    }

    @Test
    public void testAddition() {
       
        int result = m.add(3, 4);

        assertEquals(7, result);
    }

    @Test
    public void testSubtraction() {
        int result = m.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    public void testMultiplication() {
        int result = m.multiply(5, 5);
        assertEquals(25, result);
    }

    @Test
    public void testDivision() {
        int result = m.divide(20, 4);
        assertEquals(5, result);
    }
}
