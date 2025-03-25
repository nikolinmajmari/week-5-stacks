package main;

import queue.QueueInterface;
import queue.QueueIterator;
import stack.StackInterface;
import stack.list.ListStack;

import java.util.Arrays;
import java.util.Iterator;

public class StackQueue<T> implements QueueInterface<T> {

    StackInterface<T> stack;
    public StackQueue() {
        stack = new ListStack<T>();
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
        return stack.size();
    }

    @Override
    public T peek() {
        return stack.peek();
    }

    @Override
    public Object[] toArray() {
        return stack.toArray();
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }

    public static void main(String[] args) {
        StackQueue<String> stackQueue = new StackQueue<String>();
        stackQueue.enqueue("A");
        stackQueue.enqueue("B");
        stackQueue.enqueue("C");
        stackQueue.enqueue("D");
        System.out.println(stackQueue);
        System.out.println(stackQueue.dequeue());
        System.out.println(stackQueue);
    }
}
