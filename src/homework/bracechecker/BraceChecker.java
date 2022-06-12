package homework.bracechecker;

public class BraceChecker {
    private String text;
    private Stack stack = new Stack();

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
            int pop;
            switch (a) {
                case '(':
                case '{':
                case '[':
                    stack.push(a);
                    break;
                case ')':
                    pop = stack.pop();
                    if (pop == 0) {
                        System.err.println("Error: closed " + a + " but not opened at " + i);
                    } else if ((stack.pop() != '(')) {
                        System.err.println("error: closed  " + (char) pop + " but opened " + a + " " + " at  " + i);
                    }
                    break;
                case '}':
                    pop = stack.pop();
                    if (pop == 0) {
                        System.err.println("Error: closed " + a + " but not opened at " + i);
                    } else if ((stack.pop() != '{')) {
                        System.err.println("error: closed  " + a + " but opened " + (char) pop + " " + " at  " + i);
                    }
                    break;
                case ']':
                    pop = stack.pop();
                    if (pop == 0) {
                        System.err.println("Error: closed " + a + " but not opened at " + i);
                    } else if ((stack.pop() != '[')) {
                        System.err.println("error: closed  " + a + " but opened " + (char) pop + " " + " at  " + i);
                    }
                    break;
            }

        }

        int last;
        while ((last = stack.pop()) != 0) {
            System.err.println("Error: opnened " + (char) last + " but not closed ");
        }
    }
}








