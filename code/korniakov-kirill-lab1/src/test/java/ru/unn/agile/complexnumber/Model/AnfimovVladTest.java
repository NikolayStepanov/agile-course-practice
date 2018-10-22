package ru.unn.agile.complexnumber.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnfimovVladTest {
    @Test
    public void canEqualsNumbers() {
        ComplexNumber z1 = new ComplexNumber(1, 2);
        ComplexNumber z2 = new ComplexNumber(2, 4);
        assertFalse(z1.equals(z2));
    }

    @Test
    public void canAddNumbers() {
        ComplexNumber z1 = new ComplexNumber(1, 2);
        ComplexNumber z2 = new ComplexNumber(2, 4);
        ComplexNumber z = z1.add(z2);
        assertEquals(new ComplexNumber(3, 6), z);
    }

    @Test
    public void canMultiplyNumbers() {
        ComplexNumber z1 = new ComplexNumber(1, 2);
        ComplexNumber z2 = new ComplexNumber(2, 4);
        ComplexNumber z = z1.add(z2);
        assertEquals(new ComplexNumber(3, 6), z);
    }
}
