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
        // todo your code here
        return List.of();
    }


    public static void main(String[] args) {
        BinaryCounter counter = new BinaryCounter();
        System.out.println(counter.count(5));
    }
}
