package chapters.chapter12;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

public class Meta {

    @MyAnno(str = "Example of annotation", val = 100)
    public static void myMeth(String str, int i) {
        Meta ob = new Meta();

        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);

            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Method does not found.");

        }
    }

    public static void main(String[] args) {
        myMeth("test", 10);
    }
}
