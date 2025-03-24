package stack;

public interface StackInterface<T> extends Iterable<T> {
    public void push(T element);
    public T pop();
    public T peek();
    public boolean isEmpty();
    public int size();
    public Object[] toArray();
}
