package main;

import queue.QueueInterface;
import queue.array.ArrayQueue;
import stack.array.ArrayStack;
import stack.StackInterface;

import java.util.Queue;


public class ElementRemoval {


    public static <T>StackInterface<T> createNewWithout(StackInterface<T> stack,T element){
        StackInterface<T> temp = new ArrayStack<>();
        StackInterface<T> all = new ArrayStack<>();
        while (!stack.isEmpty()){
            T item = stack.pop();
            all.push(item);
            if (!element.equals(item)){
                temp.push(item);
            }
        }
        StackInterface<T> newStack = new ArrayStack<>();
        while (!temp.isEmpty()){
            newStack.push(temp.pop());
        }
        while (!all.isEmpty()){
            stack.push(all.pop());
        }
        return newStack;
    }

    public static <T>void removeElement(StackInterface<T> stack,T element)
    {
        StackInterface<T> temp = new ArrayStack<>();
        while (!stack.isEmpty()){
            T item = stack.pop();
            if (!element.equals(item)){
                temp.push(item);
            }
        }
        while (!temp.isEmpty()){
            stack.push(temp.pop());
        }
    }

    public static <T>QueueInterface<T> createNewWithout(QueueInterface<T> queue, T element){
        QueueInterface<T> temp = new ArrayQueue<>();
        for (int i=0;i<queue.size();i++){
            T item = queue.dequeue();
            if (!element.equals(item)){
                temp.enqueue(item);
            }
            queue.enqueue(item);
        }
        return temp;
    }

    public static <T>void removeElement(QueueInterface<T> queue,T element){
        int size = queue.size();
        for (int i=0;i<size;i++){
            T item = queue.dequeue();
            if (!element.equals(item)){
                queue.enqueue(item);
            }
        }
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
