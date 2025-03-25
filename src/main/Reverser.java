package main;

import queue.QueueInterface;
import queue.list.ListQueue;
import stack.list.ListStack;
import stack.StackInterface;

public class Reverser {

    public static <T>void reverse(StackInterface<T> stack) {
        // todo your code here
    }

    public static <T> void pushToEnd(StackInterface<T> stack,T element) {
        // todo your code here
    }

    public static <T>void reverseRecursively(StackInterface<T> stack) {
        // todo your code here
    }


    public static <T>void reverse(QueueInterface<T> queue) {
        // todo your code here
    }


    public static <T>void reverseRecursively(QueueInterface<T> queue) {
        // todo your code here
    }


    public static void main(String[] args) {
        {
            StackInterface<Integer> stack = new ListStack<>();
            stack.push(1);
            stack.push(2);
            stack.push(2);
            stack.push(3);
            System.out.println(stack);/// 5,2,4,3,3,2,2,1
            reverse(stack);
            System.out.println(stack);///1,2,2,3,3,4,2,5
            reverseRecursively(stack);
            System.out.println(stack);/// 5,2,4,3,3,2,2,1
        }
        {
            QueueInterface<Integer> stack = new ListQueue<>();
            stack.enqueue(1);
            stack.enqueue(2);
            stack.enqueue(2);
            stack.enqueue(3);
            System.out.println(stack);/// 1,2,2,3,3,4,2,5
            reverse(stack);
            System.out.println(stack);///5,2,4,3,3,2,2,1
            reverseRecursively(stack);
            System.out.println(stack);/// 1,2,2,3,3,4,2,5
        }
    }
}
