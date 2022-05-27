package chapters.chapter5;

public class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.print(" tick " + n);
            n--;
        } while (n > 0);
        System.out.println();

        int m = 10;
        do {
            System.out.print(" tick " + m);
        } while (--m > 0);
    }
}
