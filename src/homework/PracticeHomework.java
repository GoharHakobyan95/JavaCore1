package homework;

public class PracticeHomework {
    //փոխակերպել տրված րոպեն վայրկյանի ու վերադարձնել
    public long convert(int minutes) {
        return (long) minutes * 60;
    }

    //ընդունել տարին, վերադարձնել օրերի քանակը։
    public int calcAge(int years) {
        return years * 365;
    }

    //վերադարձնել տրված թվի հաջորդ թիվը
    public int nextNumber(int number) {
        return number++;
    }

    //վերադարձնել true եթե տրված a և b թվերը իրար հավասար են, եթե ոչ՝ false
    public boolean isSameNum(int a, int b) {
        return a == b;
    }

    //վերադարձնել true-եթե թիվը փոքր կամ հավասար է 0-ին։
    //մնացած դեպքերում վերադարձնել false
    public boolean lessThanOrEqualToZero(int a) {
        return a <= 0;

    }


    //վերադարձնել ընդունող բուլյանի ժխտված արժեքը։
    public boolean reverseBool(boolean value) {
        return value != true;
    }


    //վերադարձնել երկու մասիվի ամենամեծ length-ը
    public int maxLength(int[] array1, int[] array2) {
        return array1.length > array2.length ? array1.length : array2.length;

    }
}


