package day01;

import java.lang.reflect.Method;

/**
 * @author Gakki
 * @date 2018/10/24 - 15:02
 */
public class Demo04 {
    public static void main(String[] args) throws Exception {
        Class c = Person.class;

        Object person = c.newInstance();

        Method m2 = c.getMethod("fun2", int.class);

//        m2.invoke(person,)
    }
}
