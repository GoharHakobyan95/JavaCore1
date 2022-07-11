package chapters.chapter12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
 @interface MyAnno {
    String str();
    int val();
}
    @Retention(RetentionPolicy.RUNTIME)
     @interface What {
        String description();
    }

//    @MyAnno(str = "Example of annotation", val = 100);
//    public static void myMeth(); in method


