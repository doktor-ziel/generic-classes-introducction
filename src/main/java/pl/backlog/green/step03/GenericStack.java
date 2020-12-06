package pl.backlog.green.step03;

public interface GenericStack<T> {
    void push(T element);
    T pop();
    T peek();
    boolean isEmpty();
}
