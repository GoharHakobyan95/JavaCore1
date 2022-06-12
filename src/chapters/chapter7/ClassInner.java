package chapters.chapter7;

public class ClassInner {
    public static void main(String[] args) {
        int outer_x = 100;
//  չի կոմպիլացվում, որովհետև արտաքին կլասսը չի կարող ներդրված կլասսի արժեքներին ուղղակիորեն դիմել

//        void test() {
//            Inner inner = new Inner();
//            inner.display();
//        }
//
//        class Inner {
//            int y =10;
//        }
//            void display() {
//            System.out.println("Output outer x: " + outer_x);
//        }
//        void showy(){
//            System.out.println(y);
//        }
    }
}
