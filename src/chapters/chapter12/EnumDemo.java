package chapters.chapter12;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;

        System.out.println("ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        if (ap == Apple.GoldenDel) {
            System.out.println("ap contains GoldenDel.\n ");
        }
        switch (ap) {
            case Jonathan:
                System.out.println("Jonathan is red. ");
                break;
            case GoldenDel:
                System.out.println("GoldenDel is yellow. ");
                break;
            case RedDel:
                System.out.println("Red delicious is red. ");
                break;
            case Winesap:
                System.out.println("Winesap is red. ");
                break;
            case Cortland:
                System.out.println("Cortland is red. ");
                break;

        }
    }
}