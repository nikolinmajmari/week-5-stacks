package queue;

import java.util.Iterator;

public class QueueIterator<T> implements Iterator<T> {

    private QueueInterface<T> queue;
    public QueueIterator(QueueInterface<T> queue) {
        this.queue = queue;
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public T next() {
        return queue.dequeue();
    }
}
