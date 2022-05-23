package homework.arrayutil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        char[] resultChar = new char[spaceArray.length];
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] != ' ') {
                for (int j = spaceArray.length - 1; j > i; j--) {
                    int tmp=0;
                    if (spaceArray[j] != ' ') {

                        resultChar[i] = spaceArray[j - i + 1];
                        for (int k = 0; k < resultChar.length; k++) {
                        }
                        System.out.print(resultChar[i]);
                    }

                }
            }

        }
    }
}