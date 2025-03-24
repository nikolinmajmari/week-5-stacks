package queue.list;

import queue.QueueInterface;
import queue.QueueIterator;

import java.util.Arrays;
import java.util.Iterator;

public class ListQueue<T> implements QueueInterface<T> {

    Node<T> head;
    Node<T> tail;
    int size= 0;


    @Override
    public void enqueue(T element) {
        Node<T> newNode = new Node<>(element);
        if (tail == null) {
            head = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        size++;
    }

    @Override
    public T dequeue() {
        if (head == null) {
            return null;
        }
        T element = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }else {
            head.prev = null;
        }
        size--;
        return element;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T peek() {
        return isEmpty() ? null : head.data;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size()];
        Node<T> current = head;
        for (int i = 0; current!=null; i++) {
            array[i] =  current.data;
            current = current.next;
        }
        return array;
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }

    @Override
    public Iterator<T> iterator() {
        return new QueueIterator<>(this);
    }
}
