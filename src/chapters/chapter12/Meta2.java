package chapters.chapter12;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@What(description = "Text class's annotation")
@MyAnno(str = "Meta2", val = 99)
class Meta2 {

    @What(description = "Text class's annotation")
    @MyAnno(str = "Testing", val = 100)
    public static void myMeth() {
        Meta2 ob = new Meta2();

        try {
            Annotation annos[] = ob.getClass().getAnnotations();
            System.out.println("All annotations for Meta2");
            for (Annotation a : annos) {
                System.out.println(a);
            }
            System.out.println();

            Method m = ob.getClass().getMethod("MyMeth");
            annos = m.getAnnotations();
            System.out.println("All annotations for Meta2");
            for (Annotation a : annos) {
                System.out.println(a);
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Method does not found.");

        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}


