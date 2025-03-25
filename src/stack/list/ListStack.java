package stack.list;

import stack.StackInterface;
import stack.StackIterator;

import java.util.Arrays;
import java.util.Iterator;

public class ListStack<T> implements StackInterface<T> {

    public ListStack(){

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
        // todo your code here
        return false;
    }
    @Override
    public int size() {
        // todo your code here
        return 0;
    }

    @Override
    public Object[] toArray() {
        // todo your code here
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