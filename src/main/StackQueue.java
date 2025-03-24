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
        if (stack.isEmpty()) {
            stack.push(element);
        }else{
            T node = stack.pop();
            enqueue(element);
            stack.push(node);
        }
    }


    @Override
    public T dequeue() {
        return stack.pop();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
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
        return new QueueIterator<T>(this);
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
