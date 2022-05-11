package chapters.chapter3;

public class CoversionExample {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        // int տիպը փոխակերպել byte-ի
        System.out.println("\nint տիպի փոխակերպումը byte-ի");
        b = (byte) i;
        System.out.println("i և b " + i + " " + b);

        System.out.println("\ndouble տիպի փոխակերպումը int-ի");
        i = (int) d;
        System.out.println("d և i " + d + " " + i);

        System.out.println("\ndouble տիպի փոխակերպումը byte-ի");
        b = (byte) d;
        System.out.println("d և b " + d + " " + b);
    }
}
