package homework.dynamicarray;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

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
        return (index > 0 && index <= size) ? array[index] : 0;
    }

    public int getFirstIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (value == array[i]) {
                return i;
            }
        }
        return -1;
    }


    public void set(int index, int value) {
        int temp = 0;
        for (int i = 0; i < size; i++) {
            temp += array[index];
            array[index] = value;
        }
    }


    public void add(int index, int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == array[index]) {
                for (int j = size; j >= index; j--) {
                    array[j + 1] = array[j];
                }
                if (array[i] == array[index]) {
                    array[index] = value;
                }
                size++;
            }
        }
    }


    public void delete(int index) {
        int value = 0;
        for (int j = 0; j < size; j++) {
            value = array[index];
        }
        for (int i = 0; i < size; i++) {
            if (array[i] == array[index]) {
                for (int j = i; j < size; j++) {
                    array[j] = array[j + 1];
                }
                size--;
            }

        }
    }
}



























