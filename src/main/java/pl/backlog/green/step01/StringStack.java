package pl.backlog.green.step01;

public interface StringStack {
    void push(String element);
    String pop();
    String peek();
    boolean isEmpty();
}
