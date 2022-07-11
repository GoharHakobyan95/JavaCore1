package chapters.chapter12;

public class AutoBox4 {
    public static void main(String[] args) {
        Integer iOb = 100;
        Double dOb = 98.6;
        dOb = dOb + iOb;
        System.out.println("After dOb " + dOb);

        int a = 100;
        double b = 98.6;
        b = a + b;
        System.out.println(b);

    }
}
