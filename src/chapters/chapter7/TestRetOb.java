package chapters.chapter7;

public class TestRetOb {
    int a;

    TestRetOb(int i) {
        a = i;
    }

    TestRetOb incrByTen() {
        TestRetOb temp = new TestRetOb(a + 10);
        return temp;
    }
}

