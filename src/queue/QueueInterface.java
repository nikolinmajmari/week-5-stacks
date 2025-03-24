package queue;

public interface QueueInterface<T> extends Iterable<T> {
    void enqueue(T element);
    T dequeue();
    boolean isEmpty();
    int size();
    T peek();
    Object[] toArray();
}
