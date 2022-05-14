package homework.FigurePainters;

public class FigurePainter5 {
    public static void main(String[] args) {
        int k = 5;
        int i, j;
        for (i = 0; i < k; i++) {
            for (j = 0; j <= 2 * (k - i); j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
