package pl.backlog.green.step02;

public class SimpleStack implements Stack {
    Object array[];
    int size;
    int top;

    public SimpleStack(int size) {
        array = new String[size];
        this.size = size;
        top = 0;
    }

    @Override
    public void push(Object element) {
        array[top] = element;
        top++;
    }

    @Override
    public Object pop() {
        top--;
        return array[top];
    }

    @Override
    public Object peek() {
        return array[top-1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }
}
