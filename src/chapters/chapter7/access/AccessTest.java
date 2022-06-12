package chapters.chapter7.access;

public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();
        ob.a = 10;
        ob.b = 20;

// ERROR       ob.c = 100;

        ob.setc(100);
        System.out.print(" a, b & c: " + ob.a + " " + ob.b + " " + ob.getc());


    }
}
