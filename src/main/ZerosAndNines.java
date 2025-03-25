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
        queue.enqueue("9");
        while(true){
            String temp = queue.dequeue();
            if(Integer.parseInt(temp)%n==0){
                return Integer.parseInt(temp);
            }
            queue.enqueue(temp+"0");
            queue.enqueue(temp+"9");
        }


    }
    public static void main(String[] args) {
        System.out.println(new ZerosAndNines().findLeastMultiple(505));
    }
}