package queue.array;

import queue.QueueInterface;
import queue.QueueIterator;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayQueue<T> implements QueueInterface<T> {

    private Object[] array = new Object[4];
    private int front = 0;
    private int end = -1;
    private int size = 0;

    public ArrayQueue() {
    }

    @Override
    public void enqueue(Object element) {
        if(size == array.length) {
            expandCapacity();
        }
        end = (end + 1) % array.length;
        array[end] = element;
        size++;
    }

    private void expandCapacity() {
        Object[] newArray = new Object[array.length * 2];
        for(int i = 0; i < array.length; i++) {
            newArray[i] = array[front];
            front = (front + 1) % array.length;
        }
        front = 0;
        end = array.length - 1;
        array = newArray;
    }

    @Override
    public T dequeue() {
        if(size == 0) {
            return null;
        }
        T data = (T) array[front];
        size--;
        front = (front + 1) % array.length;

        if(size == 0){
            front = 0;
            end = -1;
        }
        return data;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T peek() {
        if(size == 0) {
            return null;
        }
      return (T)array[front];
    }

    @Override
    public Object[] toArray() {
        Object[] newArray = new Object[size];
        for(int i=0;i<size;i++){
            newArray[i] = array[(front +i)%array.length];
        }
        return newArray;
    }

    @Override
    public Iterator<T> iterator() {
        return new QueueIterator<>(this);
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }
}
