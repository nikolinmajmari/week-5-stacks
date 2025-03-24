package queue.main;

import queue.QueueInterface;
import queue.array.ArrayQueue;
import util.Helpers;

public class MainArrayQueue {
    public static void main(String[] args) {
        QueueInterface<Integer> queue = new ArrayQueue<>();
        queue.enqueue(4);
        queue.enqueue(2);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(2);
        System.out.println(queue.size()); /// 6
        System.out.println(queue);/// 4,2,1,2,3,2
        System.out.println(queue.peek());///4
        System.out.println(queue);/// 4,2,1,2,3,2
        System.out.println(queue.dequeue());/// 4
        System.out.println(queue);/// 2,1,2,3,2
        System.out.println(queue.dequeue());
        System.out.println(queue);/// 1,2,3,2
        queue.enqueue(5);
        queue.enqueue(3);
        System.out.println(queue);///1,2,3,2,5,3
        System.out.println(Helpers.max(queue)); /// 5
        System.out.println(Helpers.min(queue)); /// 1
        System.out.print("[");
        for(Integer node: queue){
            System.out.printf("%d, ", node);
        }
        System.out.print("]\n");/// [1,2,3,2,5,3]
        System.out.println(queue.size()); /// 0
    }
}
