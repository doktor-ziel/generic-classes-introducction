package pl.backlog.green.step03;

import pl.backlog.green.step02.SimpleStack;
import pl.backlog.green.step02.Stack;

public class Main {
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new SimpleGenericStack<>(10);
        GenericStack<String> stringStack = new SimpleGenericStack<>(10);

        intStack.push(10);
        stringStack.push("doktor ziel");

        int number = intStack.pop();
        System.out.println(number);

        String string = stringStack.pop();
        System.out.println(string);
    }
}
