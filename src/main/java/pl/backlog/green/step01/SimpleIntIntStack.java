package pl.backlog.green.step01;

public class SimpleIntIntStack implements IntStack {
    int array[];
    int size;
    int top;

    public SimpleIntIntStack(int size) {
        array = new int[size];
        top = 0;
        this.size = size;
    }

    @Override
    public void push(int element) {
        array[top] = element;
        top++;
    }

    @Override
    public int pop() {
        top--;
        return array[top];
    }

    @Override
    public int peek() {
        return array[top-1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }
}
