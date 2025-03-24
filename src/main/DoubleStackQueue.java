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

    public void rollRight(){
        while(!left.isEmpty()){
            right.push(left.pop());
        }
    }
    public void rollLeft(){
        while(!right.isEmpty()){
            left.push(right.pop());
        }
    }


    @Override
    public void enqueue(T element) {
        rollRight();
        right.push(element);
    }

    @Override
    public T dequeue() {
        rollLeft();
        return left.pop();
    }

    @Override
    public boolean isEmpty() {
        return left.isEmpty() && right.isEmpty();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public T peek() {
        if (left.isEmpty()){
            return right.peek();
        }else {
            return left.peek();
        }
    }

    @Override
    public Object[] toArray() {
        rollRight();
        return right.toArray();
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }

    @Override
    public Iterator<T> iterator() {
        return new QueueIterator<T>(this);
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
