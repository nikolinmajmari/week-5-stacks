package main;

import queue.QueueInterface;
import queue.array.ArrayQueue;


// Find the least multiple of n whose digits are only 0's and 9's
public class ZerosAndNines {
    private QueueInterface<String> queue;
    public ZerosAndNines() {
        this.queue = new ArrayQueue<>();
    }

    public Integer findLeastMultiple(int n) {
        // todo your code here
        return null;
    }
    public static void main(String[] args) {
        System.out.println(new ZerosAndNines().findLeastMultiple(505));
    }
}