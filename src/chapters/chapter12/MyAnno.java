package chapters.chapter12;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno {
    String str() default "Testing";

    int val() default 9000;
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
    MyAnno[] value();
}

@Target(ElementType.TYPE_USE) //marker annotation
@interface TypeAnno {

}

@Target(ElementType.TYPE_USE)  //another marker annotation,that can be applied to type
@interface NotZeroLen {
}

@Target(ElementType.TYPE_USE)  //still another marker annotation
@interface Unique {
}

@Target(ElementType.TYPE_USE)  //a parameterzied annotation
@interface MaxLen {
    int value();
}

@Target(ElementType.TYPE_PARAMETER) // An annotation that can be applied to a type parameter
@interface Why {
    String description();
}

@Target(ElementType.FIELD) // An annotation that can be applied to a field declaration
@interface EmptyOk {
}

@Target(ElementType.TYPE_USE) // An annotation that can be applied to a method field declaration
@interface Recommended {
}


@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

//    @MyAnno(str = "Example of annotation", val = 100);
//    public static void myMeth(); in method


