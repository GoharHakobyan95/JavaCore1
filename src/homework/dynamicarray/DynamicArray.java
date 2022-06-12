package homework.dynamicarray;

public class DynamicArray {
    public int[] array = new int[10];
    public int size = 0;

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        int[] temp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public boolean isEmpty() {
        return size == 0;
    }


    public int getByIndex(int index) {
        int value = 0;
        for (int j = 0; j < size; j++) {
            value += array[index];
            return value;
        }
        return 0;
    }


    public int getFirstIndexByValue(int value) {
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (value == array[i]) {
                return i;
            }
        }
        return 0;
    }


    public void set(int index, int value) {
        int temp = 0;
        for (int j = 0; j < size; j++) {
            temp += array[index];
            array[index] = value;
            System.out.print(array[j] + " ");
        }
        System.out.println();
    }


    public void delete(int index) {
        int value = 0;
        for (int j = 0; j < array.length; j++) {
            value = array[index];
        }
        for (int i = 0; i < size; i++) {
            if (array[i] == array[index]) {
                for (int j = i; j < size; j++) {
                    array[j] = array[j + 1];
                }
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    public void add(int index, int value) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[index]) {
                for (int j = size; j > 0; j--) {
                    temp = array[j];
                    array[j + 1] = array[j];
                }
                if (array[i] == array[index]) {
                    array[index] = value;
                }
            }
            System.out.print(array[i] + " ");
        }
    }

}













