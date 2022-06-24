package chapters.chapter8;

public abstract class AbstA {
    abstract void callme();

    void callmetoo() {
        System.out.println("This is concrete method. ");
    }
}

class B2 extends AbstA {
    void callme() {
        System.out.println("B2 is implementation of callme. ");
    }
}