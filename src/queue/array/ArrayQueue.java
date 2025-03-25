package queue.array;

import queue.QueueInterface;
import queue.QueueIterator;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayQueue<T> implements QueueInterface<T> {


    public ArrayQueue() {

    }


    @Override
    public void enqueue(Object element) {

    }

    private void expandCapacity() {

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
//        Object[] newArray = new Object[size];
//        for(int i=0;i<size;i++){
//            newArray[i] = array[(front+i)%array.length];
//        }
//        return newArray;
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }
}
