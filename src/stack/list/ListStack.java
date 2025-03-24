package stack.list;

import stack.StackInterface;
import stack.StackIterator;

import java.util.Arrays;
import java.util.Iterator;

public class ListStack<T> implements StackInterface<T> {
    protected Node<T> top;
    protected int size = 0;
    public ListStack() {
        top = null;
    }
    @Override
    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = top;
        top = newNode;
        size++;
    }
    @Override
    public T pop() {
        if (top == null) {
            return null;
        }
        T element = top.data;
        top = top.next;
        size--;
        return element;
    }

    @Override
    public T peek() {
        if (top == null) {
            return null;
        }
        return top.data;
    }
    @Override
    public boolean isEmpty() {
        return top == null;
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        Node<T> current = top;
        int i = 0;
        while (current != null) {
            array[i] = current.data;
            current = current.next;
            i++;
        }
        return array;
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator<T>(this);
    }
}