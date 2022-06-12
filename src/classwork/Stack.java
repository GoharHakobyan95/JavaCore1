package classwork;

public class Stack {
    private int[] array = new int[10];
    private int size;

    Stack() {
        size = -1;
    }

    public void push(int a) {
        if (size == 9) {
            System.out.println("Stack is full");
        } else {
            array[++size] = a;
        }
    }

    public int pop() {
        if (size < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return array[size--];
        }
    }
}
