package main;

import queue.QueueInterface;
import queue.array.ArrayQueue;
import stack.array.ArrayStack;
import stack.StackInterface;

import java.util.Queue;


public class ElementRemoval {


    public static <T>StackInterface<T> createNewWithout(StackInterface<T> stack,T element){
        // todo your code here
        return null;
    }

    public static <T>void removeElement(StackInterface<T> stack,T element)
    {
        // todo your code here
       return;
    }

    public static <T>QueueInterface<T> createNewWithout(QueueInterface<T> queue, T element){
        // todo your code here
        return null;
    }

    public static <T>void removeElement(QueueInterface<T> queue,T element){
        // todo your code here
    }

    public static void main(String[] args) {
        {
            System.out.println("Stacks");
            StackInterface<Integer> stack = new ArrayStack<>();
            stack.push(1);
            stack.push(2);
            stack.push(2);
            stack.push(3);
            stack.push(3);
            stack.push(4);
            stack.push(2);
            stack.push(5);
            System.out.println(stack);/// 5,2,4,3,3,2,2,1
            removeElement(stack,3);
            System.out.println(stack);///5,2,4,2,2,1
            StackInterface<Integer> stack2 = createNewWithout(stack,2);
            System.out.println(stack2);///5,4,1
        }
        {
            System.out.println("Queues");
            QueueInterface<Integer> queue = new ArrayQueue<>();
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(2);
            queue.enqueue(3);
            queue.enqueue(3);
            queue.enqueue(4);
            queue.enqueue(2);
            queue.enqueue(5);
            System.out.println(queue);/// 1,2,2,3,3,4,2,5
            removeElement(queue,3);
            System.out.println(queue);///1,2,2,4,2,5
            QueueInterface<Integer> queue2 = createNewWithout(queue,2);
            System.out.println(queue2);///1,4,5
        }
    }
}
