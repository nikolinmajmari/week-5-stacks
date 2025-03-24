package util;

import queue.QueueInterface;
import queue.array.ArrayQueue;
import queue.list.ListQueue;
import stack.StackInterface;
import stack.array.ArrayStack;
import stack.list.ListStack;

public class Helpers {
    public static <T extends Comparable<T>> T max(StackInterface<T> stack) {
        StackInterface<T> tmp = new ArrayStack<>();
        T max = null;

        while (!stack.isEmpty()) {
            T item = stack.pop();
            tmp.push(item);

            if (max == null || max.compareTo(item) < 0) {
                max = item;
            }
        }
        while (!tmp.isEmpty()) {
            stack.push(tmp.pop());
        }

        return max;
    }

    public static <T extends Comparable<T>> T min(StackInterface<T> stack) {
        StackInterface<T> tmp = new ListStack<>();
        T min = null;

        for (T item : stack) {  // Iterating over stack using foreach (non-destructive)
            tmp.push(item);
            if (min == null || min.compareTo(item) > 0) {
                min = item;
            }
        }

        // Restore the stack
        while (!tmp.isEmpty()) {
            stack.push(tmp.pop());
        }

        return min;
    }

    ///
    /// Find queue maximum
    ///
    public static <T extends Comparable<T>> T max(QueueInterface<T> queue) {
        QueueInterface<T> tmp = new ListQueue<T>();
        T max = null;
        while (!queue.isEmpty()) {
            T item = queue.dequeue();
            tmp.enqueue(item);
            if (max == null) {
                max = item;
            } else if (max.compareTo(item) < 0) {
                max = item;
            }
        }
        while (!tmp.isEmpty()) {
            queue.enqueue(tmp.dequeue());
        }
        return  max;
    }

    ///
    /// Find queue maximum
    ///
    public static <T extends Comparable<T>> T min(QueueInterface<T> queue) {
        QueueInterface<T> tmp = new ArrayQueue<>();
        T min = null;
        for(T item : queue) {
            tmp.enqueue(item);
            if (min == null) {
                min = item;
            } else if (min.compareTo(item) > 0) {
                min = item;
            }
        }
        for(T item : tmp) {
            queue.enqueue(item);
        }
        return  min;
    }

}
