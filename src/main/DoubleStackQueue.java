package main;

import queue.QueueInterface;
import queue.QueueIterator;
import stack.StackInterface;
import stack.array.ArrayStack;

import java.util.Arrays;
import java.util.Iterator;

public class DoubleStackQueue<T> implements QueueInterface<T> {

    StackInterface<T> left;
    StackInterface<T> right;

    DoubleStackQueue() {
        left = new ArrayStack<>();
        right = new ArrayStack<>();
    }


    @Override
    public void enqueue(T element) {
        // todo your code here
    }

    @Override
    public T dequeue() {
        // todo your code here
        return null;
    }

    @Override
    public boolean isEmpty() {
        // todo your code here
        return false;
    }

    @Override
    public int size() {
        // todo your code here
        return 0;
    }

    @Override
    public T peek() {
        // todo your code here
      return null;
    }

    @Override
    public Object[] toArray() {
        // todo your code here
        return right.toArray();
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    public static void main(String[] args) {
        QueueInterface<String> doubleStackQueue = new DoubleStackQueue<>();
        doubleStackQueue.enqueue("A");
        doubleStackQueue.enqueue("B");
        doubleStackQueue.enqueue("C");
        doubleStackQueue.enqueue("D");
        System.out.println(doubleStackQueue);
        System.out.println(doubleStackQueue.dequeue());
        System.out.println(doubleStackQueue);
    }
}
