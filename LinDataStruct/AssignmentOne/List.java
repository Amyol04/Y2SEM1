package Assignment1;

public interface List<T> {
    void prepend(T x);
    T getFirst();
    void deleteFirst();
    void append(T x);
    T getLast();
    void deleteLast();
    boolean empty();
}
