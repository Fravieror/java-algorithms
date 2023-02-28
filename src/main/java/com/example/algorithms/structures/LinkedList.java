package com.example.algorithms.structures;

import java.util.ArrayList;

public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public String print() {
        Node current = head;
        ArrayList<Integer> dynamicArray = new ArrayList<Integer>();
        while (current != null) {
            dynamicArray.add(current.data);
            current = current.next;
        }
        return dynamicArray.toString();
    }
}
