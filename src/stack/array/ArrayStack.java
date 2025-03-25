package stack.array;

import stack.StackInterface;
import stack.StackIterator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayStack<T> implements StackInterface<T> {

    public ArrayStack() {
    }

    @Override
    public void push(T element) {

    }

    private void expandCapacity() {

    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T peek() {
       return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {

        return 0;
    }

    @Override
    public Object[] toArray() {
//        if (top == -1){
//            return new Object[]{};
//        }
//        Object[] array =  Arrays.copyOf(stack, size);
//        Object[] reversed = new Object[size];
//        for (int i=0;i<size;i++){
//            reversed[i] = array[size-1-i];
//        }
//        return reversed;
        return null;
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
