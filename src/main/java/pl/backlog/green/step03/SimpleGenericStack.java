package pl.backlog.green.step03;

import java.util.ArrayList;
import java.util.List;

public class SimpleGenericStack<T> implements GenericStack<T> {
    T array[];
    int size;
    int top;

    public SimpleGenericStack(int size) {
        List<T> temp = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            temp.add(null);
        }
        array = (T[]) temp.toArray();
        this.size = size;
        top = 0;
    }

    @Override
    public void push(T element) {
        array[top] = element;
        top++;
    }

    @Override
    public T pop() {
        top--;
        return array[top];
    }

    @Override
    public T peek() {
        return array[top-1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }
}
