package day01.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author Gakki
 * @date 2018/10/25 - 17:36
 */
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
public @interface MyAnno3 {
}
