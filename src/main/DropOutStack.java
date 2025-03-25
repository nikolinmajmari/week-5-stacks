package main;

import stack.StackInterface;
import stack.StackIterator;
import stack.array.ArrayStack;
import util.Helpers;

import java.util.Arrays;
import java.util.Iterator;

public class DropOutStack<T> implements StackInterface<T> {

    T[] array;

    int top = -1;
    int end = 0;
    int size = 0;
    public DropOutStack(int length) {
        array = (T[]) new Object[length];
    }


    @Override
    public void push(T element) {
        // todo your code here
    }

    @Override
    public T pop() {
        // todo your code here
        return null;
    }

    @Override
    public T peek() {
        // todo your code here
      return null;
    }

    @Override
    public boolean isEmpty() {

        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        if(size == 0) {
            return new Object[]{};
        }else {
            Object[] array = new Object[size];
            int index = top;
            for (int i=0;i<size;i++){
                array[i] = this.array[index];
                index = (array.length + index - 1) % array.length;
            }
            return array;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator<T>(this);
    }

    public static void main(String[] args) {
        StackInterface<Integer> stack = new DropOutStack<>(3);
        stack.push(4);
        stack.push(2);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(1);
        System.out.printf("Stack=%s",stack); /// 2,3,1
        System.out.printf("Peek=%s",stack.peek());///2
        System.out.printf("Stack=%s",stack);/// 2,3,1
        System.out.printf("stack.pop()=%s",stack.pop());/// 2
        System.out.printf("Stack=%s",stack);/// 2,3
        System.out.printf("stack.pop()=%s",stack.pop());
        System.out.printf("Stack=%s",stack);/// 3
        stack.push(5);
        stack.push(3);
        stack.push(1);
        System.out.printf("Stack size: %d",stack.size());
        System.out.println(stack);/// 1,3,5
        System.out.println(Helpers.max(stack)); /// 5
        System.out.println(Helpers.min(stack)); /// 1
        System.out.print("[");
        for(Integer node: stack){
            System.out.printf("%d, ", node);
        }
        System.out.print("]\n");/// [5, 3, 2, 1, 2, 4,]
        System.out.println(stack.size()); /// 0
    }
}
