package homework.quizes;

public class For {
    public static void main(String[] args) {
        for (int i = 4; i <= 5; i++) {
            for (int j = 0; j < 6; j = j + 2) {
                System.out.println(i + ", " + j);
            }
        }
    }
}
