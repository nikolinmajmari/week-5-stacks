package stack.list;

import stack.StackInterface;
import stack.StackIterator;

import java.util.Arrays;
import java.util.Iterator;

public class ListStack<T> implements StackInterface<T> {

    Node<T> head;
    private int size = 0;

    public ListStack(){
        head = null;
    }
    @Override
    public void push(T element) {
      Node<T> newNode = new Node<>(element);
      newNode.next = head;
      size++;
      head = newNode;
    }
    @Override
    public T pop() {
        if (head == null) {
            return null;
        }
        size--;
        T data = head.data;
        head = head.next;
        return data;
    }

    @Override
    public T peek() {
        if (head == null) {
            return null;
        }
        return head.data;
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
    public Object[] toArray() {
        Object[] array = new Object[size];
        Node<T> current = head;
        for (int i = 0; current!=null; i++) {
            array[i] = current.data;
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
        return new StackIterator<>(this);
    }
}