package homework.arrayutil;

import java.sql.SQLOutput;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int resultAscending = 0;
                if (numbers[i] > numbers[j]) {
                    resultAscending = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = resultAscending;
                }
            }
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int resultDescending = 0;
                if (numbers[i] < numbers[j]) {
                    resultDescending = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = resultDescending;
                }
            }
            System.out.print(numbers[i] + ", ");
        }

    }
}
