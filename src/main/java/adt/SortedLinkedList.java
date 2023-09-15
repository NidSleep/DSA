/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt;

/**
 *
 * @author user
 */
public class SortedLinkedList<T extends Comparable<T>> implements SortedList<T> {

    private Node<T> head;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public SortedLinkedList() {
        head = null;
    }

    @Override
    public boolean add(T newEntry) {
        Node<T> newNode = new Node<>(newEntry);

        if (head == null || newEntry.compareTo(head.data) <= 0) {
            newNode.next = head;
            head = newNode;
            return true;
        }

        Node<T> current = head;
        while (current.next != null && newEntry.compareTo(current.next.data) > 0) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
        return true;
    }

    @Override
    public boolean remove(T anEntry) {
        if (head == null) {
            return false;
        }

        if (anEntry.equals(head.data)) {
            head = head.next;
            return true;
        }

        Node<T> current = head;
        while (current.next != null && !anEntry.equals(current.next.data)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            return true;
        }

        return false;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public boolean contains(T anEntry) {
        Node<T> current = head;
        while (current != null) {
            if (anEntry.equals(current.data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int getNumberOfEntries() {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}

