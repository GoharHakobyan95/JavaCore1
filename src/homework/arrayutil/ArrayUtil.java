package homework.arrayutil;

public class ArrayUtil {
    public int max(int[] numbers) {
        int max = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }


    public int min(int[] numbers) {
        int min = numbers.length;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }


    public int getOddNums(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] % 2) == 1) ;
            result++;
        }
        int[] oddNums = new int[result];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 1) {
                oddNums[j] = numbers[i];
                j++;
            }
        }
        return j;
    }


    public int getEvenNums(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] % 2) == 0) ;
            result++;
        }
        int[] evenNums = new int[result];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                evenNums[j] = numbers[i];
                j++;
            }
        }
        return j;
    }

    public double sumOfNums(int[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public double avgOfNums(int[] numbers) {
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            avg = sum / numbers.length;
        }
        return avg;
    }
}