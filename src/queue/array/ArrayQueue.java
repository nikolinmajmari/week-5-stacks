package queue.array;

import queue.QueueInterface;
import queue.QueueIterator;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayQueue<T> implements QueueInterface<T> {

    int size = 0;
    int front=0;
    int rear=-1;
    Object[] array;

    public ArrayQueue() {
        array = new Object[2];
    }


    @Override
    public void enqueue(Object element) {
        if(size==array.length){
            expandCapacity();
        }
        rear = (rear+1)%array.length;
        array[rear] = element;
        size++;
    }

    private void expandCapacity() {
        Object[] newArray = new Object[array.length*2];
        for(int i=0;i<array.length;i++){
            newArray[i] = array[(front+i)%array.length];
        }
        array = newArray;
        front = 0;
        rear = size-1;
    }

    @Override
    public T dequeue() {
        if(isEmpty()){
            return null;
        }
        T element = (T) array[front];
        if(front==rear){
            front = 0;
            rear = -1;
        }else {
            front = (front+1)%array.length;
        }
        size--;
        return element;
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
        if (isEmpty()) {
            return null;
        };
        return (T) array[front];
    }

    @Override
    public Object[] toArray() {
        Object[] newArray = new Object[size];
        for(int i=0;i<size;i++){
            newArray[i] = array[(front+i)%array.length];
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
