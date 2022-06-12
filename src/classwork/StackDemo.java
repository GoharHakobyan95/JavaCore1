package classwork;


public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(6);
        stack.push(4);
        stack.push(8);
        stack.push(5);
        stack.push(11);
        stack.push(2);
        stack.push(115);
        stack.push(9);

        int a = stack.pop();
        int b = stack.pop();
        int c = stack.pop();
        int d = stack.pop();
        int e = stack.pop();
        System.out.println(e);
    }
}