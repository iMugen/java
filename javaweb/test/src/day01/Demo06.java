package day01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Gakki
 * @date 2018/10/26 - 9:19
 */
public class Demo06 {
    public static void main(String[] args) throws Exception {
        Class c1 = Student.class;
        Class c2 = new Student("Gakkki").getClass();

        Constructor con = c1.getConstructor(String.class);
        Object o = con.newInstance("loveGakki");
        System.out.println(o);
        Field f = c1.getDeclaredField("name");

        Method method = c1.getMethod("toString");
        method.invoke(o);


    }
}
