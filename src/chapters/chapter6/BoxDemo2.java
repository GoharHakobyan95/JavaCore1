package chapters.chapter6;

public class BoxDemo2 {
    public static void main(String[] args) {
        double vol;
        Box1 myBox1 = new Box1();
        Box1 myBox2 = new Box1();

        myBox1.width = 10;
        myBox1.heigth = 20;
        myBox1.depth = 15;

        myBox2.width = 3;
        myBox2.heigth = 6;
        myBox2.depth = 9;

        vol = myBox1.width * myBox1.heigth * myBox1.depth;
        System.out.println("Volume is " + vol);

        vol = myBox2.width * myBox2.heigth * myBox2.depth;
        System.out.print("Volume is " + vol);

    }
}



