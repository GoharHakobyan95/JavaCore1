package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        array.add(8);
        array.add(5);
        array.add(0);
        array.add(11);
        array.add(12);
        array.add(95);
        array.add(67);
        array.add(88);
        array.add(105);
        array.add(22);
        array.add(502);
        array.add(10);
        array.print();
        System.out.println();

        System.out.println(array.isEmpty());

        System.out.println(array.getByIndex(8));

        System.out.println(array.getFirstIndexByValue(88));

        array.set(6, 725);
        array.print();
        System.out.println();

        array.add(5, 451);
        array.print();
        System.out.println();

        array.delete(7);
        array.print();
        System.out.println();

    }
}
