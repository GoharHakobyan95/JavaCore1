package chapters.chapter3;

// Ներկայացնել կոդի բլոկի տեսանելիության շրջանակը
public class Scope {
    public static void main(String[] args) {
        int x = 10;// այս փոփոխականը հասանելի է ողջ main() կոդին
        if (x == 10) {  // գործողության նոր շրջանակի սկիզբը
            int y = 20;// հասանելի է միայն այս բլոկի կոդի համար

            System.out.println("x և y ։ " + " " + y);
            x = y * 2;
        }
// y = 100; սխալ, y փոփոխականը անհասանելի , այն պարագայում, երբ x հասանելի է
        System.out.println("x հավասար է : " + x);
    }
}

