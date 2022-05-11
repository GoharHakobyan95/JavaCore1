package chapters.chapter2;

public class IfExample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;

        if (x < y) {
            System.out.println("x–ը փոքր է y-ից։");

            x = x * 2;
            if (x == y) {
                System.out.println("x–ը հավասար է y-ից։");

                x = x * 2;
                if (x > y) {
                    System.out.println("x–ը մեծ է y-ից։");
                }
            }
        }
    }
}