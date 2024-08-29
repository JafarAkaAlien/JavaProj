package Interfaces;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class BTest {
    @Test
    void testFunctionA() {
        B testobj = new B();
        assertEquals("Salam", testobj.functionA());
    }
}
