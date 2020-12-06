package pl.backlog.green.step02;

public class Main {
    public static void main(String[] args) {
        Stack intStack = new SimpleStack(10);
        Stack stringStack = new SimpleStack(10);

        intStack.push(10);
        stringStack.push("doktor ziel");

        intStack.push("zielony");
        stringStack.push(123);

        int number = (int) intStack.pop();
        String string = (String) stringStack.pop();
    }
}
