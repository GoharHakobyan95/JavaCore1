package chapters.chapter5;

public class BreakLoop2 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            if (i == 10) {
                break;
            }
            i++;
            System.out.println("i = " + i);
        }
        System.out.println("Loop complete.");
    }
}

