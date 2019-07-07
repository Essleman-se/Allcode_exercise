package junitExamples;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculationTest {

    @Test
    public void findMax() {

        assertEquals(9, Calculation.findMax(new int[]{2,3,6,9}));
        assertEquals(-1, Calculation.findMax(new int[]{-1,-2,-9}));
    }

    @Test
    public void cube() {

        assertEquals(27, Calculation.cube(3));
        assertEquals(1, Calculation.cube(1));
    }

    @Test
    public void reverseWord() {

        assertEquals("salas odies ", Calculation.reverseWord("salas seido"));
    }

    @Test
    public void falseReverseWord() {

        assertNotEquals("salas odies ", Calculation.reverseWord("salas seydo "));
    }
}