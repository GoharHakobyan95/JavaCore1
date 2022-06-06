package homework.braceChecker;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack();

        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
            if (a == '(' || a == '[' || a == '{') {
                stack.push(a);
            }
            char check;
            switch (a) {
                case ')':
                    check = stack.pop();
                    if (stack.pop() != '(') {
                        System.out.println("error: opened  " + check + " but closed " + a + " " + " at index " + (i));
                        break;
                    }
                case '}':
                    check = stack.pop();
                    if (stack.pop() != '{') {
                        System.out.println("error: opened  " + check + " but closed " + a + " at index " + (i));
                        break;
                    }
                case ']':
                    check = stack.pop();
                    if (stack.pop() != '[') {
                        System.out.println("error: opened  " + check + " but closed " + a + " at index " + (i));
                        break;
                    }
            }
        }


        if (stack.isEmpty()) {
            System.out.println("isEmpty");
        }

    }
}

