package queue.list;

public class Node<T>{
    T data;
    Node<T> next;
    Node<T> prev;
    public Node(T data) {
        this.data = data;
    }
}
