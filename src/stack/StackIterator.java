package stack;

import java.util.Iterator;
import java.util.Stack;

public class StackIterator<T> implements Iterator<T> {

    private StackInterface<T> stack;
    public StackIterator(StackInterface<T> stack) {
        this.stack = stack;
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public T next() {
        return stack.pop();
    }
}
