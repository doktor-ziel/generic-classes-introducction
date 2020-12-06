package pl.backlog.green.step01;

/**
 * Interface for stack classes that keeps integer values
 */
public interface IntStack {
    /**
     * Pushes element onto stack's top
     * @param element
     */
    void push(int element);

    /**
     * Gets and removes element from stack's top
     * @return value from the stack's top
     */
    int pop();

    /**
     * Only returns element from stack's top
     * @return value from the stack's top
     */
    int peek();

    /**
     * Checks if stack is empty
     * @return true if stack is empty, false otherwise
     */
    boolean isEmpty();
}