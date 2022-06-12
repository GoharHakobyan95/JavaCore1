package homework.bracechecker;

public class Stack {
    private int[] stack = new int[10];
    private int size;

    public Stack() {
        size = -1;
    }


    public void push(int x) {
        if (size == stack.length - 1) {
        } else {
            stack[++size] = x;
        }
    }

    public int pop() {
        if (size < 0) {

            return 0;
        } else {
            return stack[size--];
        }
    }

    public boolean isEmpty() {
        return size == -1;
    }

}

