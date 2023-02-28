package com.example.algorithms.structures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTests {
    @Test
    public void GeneralTest() {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals("[1, 2, 3]", list.print()); // prints "1 2 3"
        list.remove(2);
        assertEquals("[1, 3]",  list.print()); // prints "1 3"
    }
}
