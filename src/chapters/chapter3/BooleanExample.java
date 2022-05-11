package chapters.chapter3;

public class BooleanExample {
    public static void main(String[] args) {
        boolean b = false;
        System.out.println("boolean b հավասար է " + b);

        b = true;
        System.out.println("boolean b հավասար է " + b);

        if (b) {
            System.out.println("Կոդն իրականացվում է");

            b = false;
            System.out.println("Կոդը չի իրականացվում");
            System.out.println("10 > 9 հավասար է " + (10 > 9));
        }
    }
}