package queue.list;

import queue.QueueInterface;
import queue.QueueIterator;

import java.util.Arrays;
import java.util.Iterator;

public class ListQueue<T> implements QueueInterface<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    @Override
    public void enqueue(T element) {
        Node<T> newNode = new Node<>(element);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
       return;
    }

    @Override
    public T dequeue() {
        if(head == null) {
            return null;
        }

        T data = head.data;
        head = head.next;
        if(head == null) {
            tail = null;
        }else {
            head.prev = null;
        }
        size--;
       return data;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T peek() {
        if(head == null) {
            return null;
        }
        return head.data;
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
