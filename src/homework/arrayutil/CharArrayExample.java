package homework.arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};

        char c = 'o';

        int countOfC = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                countOfC++;
            }
        }
        System.out.println(countOfC);


        int middleIndex = chars.length / 2;
        System.out.print(chars[middleIndex - 1] + (","));
        System.out.println(chars[middleIndex]);


        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'l', 'y'};

        char x = chars3[chars3.length - 2];
        char y = chars3[chars3.length - 1];
        boolean result = false;
        if (x == 'l' && y == 'y') {
            result = true;
        }
        System.out.println(result);


        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};

        boolean isBob = false;
        for (int i = 0; i < bobArray.length - 2; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                isBob = true;
                break;
            }
        }
        System.out.println(result);

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};

        for (int j = 0; j < text.length; j++) {
            if (text[j] != ' ') {
                System.out.print(text[j]);
            }

        }
    }
}






