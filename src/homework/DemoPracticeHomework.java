package homework;

public class DemoPracticeHomework {
    public static void main(String[] args) {
        PracticeHomework practice = new PracticeHomework();

        System.out.println(practice.convert(5));
        System.out.println(practice.calcAge(10));
        System.out.println(practice.nextNumber(421));
        System.out.println(practice.isSameNum(455, 55));
        System.out.println(practice.lessThanOrEqualToZero(-128));
        System.out.println(practice.reverseBool(true));
        System.out.println(practice.maxLength(new int[]{1, 55, 22}, new int[]{22, 0, -8, 33, 6}));
    }
}
