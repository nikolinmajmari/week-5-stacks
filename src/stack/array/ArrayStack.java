package stack.array;

import stack.StackInterface;
import stack.StackIterator;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayStack<T> implements StackInterface<T> {

    protected Object[] stack;
    protected int size = 0;
    protected int top = -1;

    public ArrayStack() {
        stack =  new Object[2];
    }

    @Override
    public void push(T element) {
        top++;
        if (top == stack.length){
            expandCapacity();
        }
        stack[top] = element;
        size++;
    }

    private void expandCapacity() {
        Object[] newStack = new Object[stack.length * 2];
        System.arraycopy(stack, 0, newStack, 0, stack.length);
        stack = newStack;
    }

    @Override
    public T pop() {
        if (top == -1){
            return null;
        }
        Object element = stack[top];
        stack[top] = null;
        top--;
        size--;
        return (T) element;
    }

    @Override
    public T peek() {
        if (top == -1){
            return null;
        }
        return (T) stack[top];
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        if (top == -1){
            return new Object[]{};
        }
        return Arrays.copyOf(stack, size);
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator<>(this);
    }
}
