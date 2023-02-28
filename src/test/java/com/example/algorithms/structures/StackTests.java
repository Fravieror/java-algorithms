package com.example.algorithms.structures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTests {
    @Test
    public void GeneralTest() {
        Stack stack = new Stack(10);
        stack.push(5);
        stack.push(10);

        assertEquals(10, stack.peek());
        assertEquals(10, stack.pop());
        assertEquals(5, stack.pop());

        try {
            stack.pop();
        } catch (RuntimeException ex) {
            // Expected exception was thrown, do additional checks here
            assertEquals("Stack is empty", ex.getMessage());
        }


    }
}
