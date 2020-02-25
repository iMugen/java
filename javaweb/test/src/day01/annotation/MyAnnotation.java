package day01.annotation;

/**
 * @author Gakki
 * @date 2018/10/25 - 17:15
 */
public @interface MyAnnotation {
    int value();
    Person per();
    MyAnno2 anno2();
    String[] STRINGS();
}
