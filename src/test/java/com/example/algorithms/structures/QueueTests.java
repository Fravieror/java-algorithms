package com.example.algorithms.structures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueTests {
    @Test
    public void GeneralTest() {
        Queue queue = new Queue(10);
        queue.enqueue(5);
        queue.enqueue(10);

        assertEquals(5, queue.peek()); // prints 5
        assertEquals(5, queue.dequeue()); // prints 5
        assertEquals(10, queue.dequeue()); // prints 10

        try {
            queue.dequeue();
        } catch (RuntimeException ex) {
            // Expected exception was thrown, do additional checks here
            assertEquals("Queue is empty", ex.getMessage());
        }
    }
}
