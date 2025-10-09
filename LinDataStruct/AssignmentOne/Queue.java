package Assignment1;

public interface Queue<T> {
    void enqueue(T x);
    T dequeue();
    T next();
    boolean empty();
}
