package main;

import queue.QueueInterface;
import queue.array.ArrayQueue;

import java.util.ArrayList;
import java.util.List;

public class BinaryCounter {
    private QueueInterface<String> queue;

    public BinaryCounter() {
        queue = new ArrayQueue<>();
    }

    List<String> count(int n) {
        queue.enqueue("1");
        List<String> result = new ArrayList<>();
        while (n>0) {
            String s = queue.dequeue();
            result.add(s);
            n--;
            queue.enqueue(s + '0');
            queue.enqueue(s + '1');
        }
        return result;
    }


    public static void main(String[] args) {
        BinaryCounter counter = new BinaryCounter();
        System.out.println(counter.count(5));
    }
}
