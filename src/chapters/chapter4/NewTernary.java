package chapters.chapter4;

public class NewTernary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i;
        System.out.print("Բացարձակ արժեքը  " + i + " = " + k);

        i = -10;
        k = i < 0 ? -i : i;
        System.out.println();
        System.out.print("Բացարձակ արժեքը " + i + " = " + k);

    }
}
