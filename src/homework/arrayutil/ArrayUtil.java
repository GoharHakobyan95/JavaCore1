package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        //print numbers
        int[] numbers = {15, 125, 2, -892, 0, 41, 857, -56, 919, 424};
        System.out.print("Numbers = ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + (", "));
        }
        System.out.println();

        //print max from numbers
        int maxValue = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        System.out.println("Max value = " + maxValue);


        //print min from numbers
        int minValue = numbers.length;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        System.out.println("Min value = " + minValue);


        //print even numbers
        System.out.print("Even numbers = ");
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] % 2) == 0) {
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.println();

        //print odd numbers
        System.out.print("Odd numbers = ");
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] % 2) != 0) {
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.println();

        // count of evens & odds;
        int countOfEvenNums = 0;
        int countOfOddNums = 0;
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] % 2) == 0) {
                countOfEvenNums++;
            } else {
                countOfOddNums++;
            }
        }
        System.out.println("Count of even nums = " + countOfEvenNums);
        System.out.println("Count of odd nums = " + countOfOddNums);


        //        //count of array nums
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.print("Count of array nums = " + sum);
        System.out.println();
        //avarage of array nums
        double avg = sum / numbers.length;
        System.out.println("Avarage of nums = " + avg);
    }
}





