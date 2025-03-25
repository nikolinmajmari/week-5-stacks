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
        List<String> list = new ArrayList<>();
        queue.enqueue("1");
        while (n>0) {
            String element = queue.dequeue();
            list.add(element);
            queue.enqueue(element + "0");
            queue.enqueue(element + "1");
            n--;
        }
        return list;
    }


    public static void main(String[] args) {
        BinaryCounter counter = new BinaryCounter();
        System.out.println(counter.count(5));
    }
}
