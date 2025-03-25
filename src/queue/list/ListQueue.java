package queue.list;

import queue.QueueInterface;
import queue.QueueIterator;

import java.util.Arrays;
import java.util.Iterator;

public class ListQueue<T> implements QueueInterface<T> {

    @Override
    public void enqueue(T element) {
       return;
    }

    @Override
    public T dequeue() {
       return null;
    }

    @Override
    public boolean isEmpty() {

        return false;
    }

    @Override
    public int size() {

        return 0;
    }

    @Override
    public T peek() {

        return null;
    }

    @Override
    public Object[] toArray() {
//        Object[] array = new Object[size()];
//        Node<T> current = head;
//        for (int i = 0; current!=null; i++) {
//            array[i] =  current.data;
//            current = current.next;
//        }
//        return array;
        return null;
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
