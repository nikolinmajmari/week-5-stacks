package main;

import queue.QueueInterface;
import stack.array.ArrayStack;
import stack.StackInterface;


public class ElementRemoval {


    public static <T>StackInterface<T> createNewWithout(StackInterface<T> stack,T element){
        return null;
    }

    public static <T>void removeElement(StackInterface<T> stack,T element){

    }

    public static <T>QueueInterface<T> createNewWithout(QueueInterface<T> queue, T element){
        return null;
    }

    public static <T>void removeElement(QueueInterface<T> queue,T element){

    }

    public static void main(String[] args) {
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
}
