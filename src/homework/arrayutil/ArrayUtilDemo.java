package homework.arrayutil;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil au = new ArrayUtil();
        int[] numbers = {15, 125, 2, -892, 0, 41, 857, -56, 919, 424};

        System.out.println("max = " + au.max(numbers));
        System.out.println("min = " + au.min(numbers));
        System.out.print("count of odd nums = " + au.getOddNums(numbers));
        System.out.println();
        System.out.print("count of even nums = " + au.getEvenNums(numbers));
        System.out.println();
        System.out.print("sum of array nums = " + au.sumOfNums(numbers));
        System.out.println();
        System.out.print("avarage of array nums = " + au.avgOfNums(numbers));


    }
}

