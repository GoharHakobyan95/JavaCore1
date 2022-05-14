package chapters.chapter4;

public class ByteShit {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);
        System.out.println("Original valuee of a: " + a);
        System.out.println("i and b: " + i + " " + b);
    }
}
