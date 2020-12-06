package pl.backlog.green.step01;

public class SimpleStringStack implements StringStack {
    String array[];
    int size;
    int top;

    public SimpleStringStack(int size) {
        array = new String[size];
        this.size = size;
        top = 0;
    }

    @Override
    public void push(String element) {
        array[top] = element;
        top++;
    }

    @Override
    public String pop() {
        top--;
        return array[top];
    }

    @Override
    public String peek() {
        return array[top-1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }
}
