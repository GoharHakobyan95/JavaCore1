package chapters.chapter9;

public interface MyIf {
    int getNumber();

    default String getString() {
        return "Default object String";
    }

    static int getDeafaultNumber() {
        return 0;
    }
}
