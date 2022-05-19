package homework.arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int countOfC = 0;
        for (int i = 0; i < chars.length; i++) {
            if (c == chars[i]) {
                countOfC++;
            }
        }
        System.out.println(countOfC);

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};

        System.out.print(chars2[chars2.length / 2 - 1] + (", "));
        System.out.println(chars2[chars2.length / 2]);


        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'l', 'y'};
        {
            if (chars3[chars2.length - 1] == 'l' && chars3[chars2.length] == 'y') {
                System.out.println(true);
            } else {
                System.out.print(false);
            }
        }

        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};
        for (int i = 0; i <= 3; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int j = 0; j < text.length; j++) {
            if (text[j] != ' ') {
                System.out.print(text[j]);
            }

        }
    }
}






