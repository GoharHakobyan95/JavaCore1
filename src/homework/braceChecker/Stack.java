package homework.braceChecker;

public class Stack {
    char[] stack = new char[]{10};
    private int size;

    public Stack() {
        size = -1;
    }


    void push(char x) {
        if (size == stack.length) {
        } else {
            stack[++size] = x;
        }
    }

    public char pop() {
        if (size < 0) {
            return 0;
        } else {
            return stack[size--];
        }
    }

    public boolean isEmpty() {

        return false;
    }
}

