package util;

import queue.QueueInterface;
import queue.array.ArrayQueue;
import queue.list.ListQueue;
import stack.StackInterface;
import stack.array.ArrayStack;
import stack.list.ListStack;

public class Helpers {
    public static <T extends Comparable<T>> T max(StackInterface<T> stack) {
        StackInterface<T> temp = new ListStack<>();
        T max = null;
        while (!stack.isEmpty()) {
            if(max == null || max.compareTo(stack.peek()) > 0) {
                max = stack.peek();
            }
            temp.push(stack.pop());
        }
        for (T element: temp) {
            stack.push(element);
        }
        return max;
    }

    public static <T extends Comparable<T>> T min(StackInterface<T> stack) {
        // todo your code here
        return null;
    }

    ///
    /// Find queue maximum
    ///
    public static <T extends Comparable<T>> T max(QueueInterface<T> queue) {
        T max = null;
//        QueueInterface<T> temp = new ListQueue<>();
//        for(T element: queue) {
//            if(max == null || max.compareTo(element) < 0) {
//                max = element;
//            }
//        }
//        for (T element: temp) {
//            queue.enqueue(element);
//        }
        for(int i=0;i<queue.size();i++) {
            if(max == null || max.compareTo(queue.peek()) < 0) {
                max = queue.peek();
            }
            queue.enqueue(queue.dequeue());
        }
        return null;
    }

    ///
    /// Find queue maximum
    ///
    public static <T extends Comparable<T>> T min(QueueInterface<T> queue) {
        // todo your code here
        return null;
    }

}
