package homework;

public class TestArray {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        numbers[0] = 42;
        numbers[1] = 13;
        numbers[2] = 12;
        numbers[3] = 15;
        numbers[4] = 16;
        numbers[5] = 17;
        numbers[6] = 18;


        int index = 0;
        while (index < numbers.length) {
            index++;
        }
        int result = 0;

        for (int i = numbers.length; i >=0; i--) {
            if (numbers[i] == 7) {
                    result = numbers[i];
                    numbers[i + 1] = numbers[i] ;
                   numbers[i]=result;
                }

            System.out.println(numbers[i]);
            }


        }
    }

