package chapters.chapter3;

public class CharDemo2 {
    public static void main(String[] args) {
        char ch1 = 'X';
        char ch2 = 'x';
        System.out.println("ch1 պարունակում է " + ch1);
        ch1++;// ch1-ի արժեքը մեկ միավորով մեծացնենք
        System.out.println("ch1 պարունակում է " + ch1++);
        ch2--;
        System.out.println("ch2 պարունակում է " + ch2--);
    }

}
