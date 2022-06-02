package homework;

public class PracticeHomework {
    //փոխակերպել տրված րոպեն վայրկյանի ու վերադարձնել
    public long convert(int minutes) { return minutes * 60;
    }

    //ընդունել տարին, վերադարձնել օրերի քանակը։
    public int calcAge(int years) { return years * 365;
    }

    //վերադարձնել տրված թվի հաջորդ թիվը
    public int nextNumber(int number) { return number + 1;
    }

    //վերադարձնել true եթե տրված a և b թվերը իրար հավասար են, եթե ոչ՝ false
    public boolean isSameNum(int a, int b) {
        boolean isSameNum = (a == b) ? true : false; return isSameNum;
    }

    //վերադարձնել true-եթե թիվը փոքր կամ հավասար է 0-ին։
    //մնացած դեպքերում վերադարձնել false
    public boolean lessThanOrEqualToZero(int a) {
        boolean lessThanOrEqualToZero = a <= 0 ? true : false; return lessThanOrEqualToZero;
    }


    //վերադարձնել ընդունող բուլյանի ժխտված արժեքը։
    public boolean reverseBool(boolean value) {
        boolean reverseBool = (value != true) ? true : false; return reverseBool;
    }


    //վերադարձնել երկու մասիվի ամենամեծ length-ը
    public int maxLength(int[] array1, int[] array2) {
        int maxLength = (array1.length > array2.length) ? array1.length : array2.length; return maxLength;
    }
}


