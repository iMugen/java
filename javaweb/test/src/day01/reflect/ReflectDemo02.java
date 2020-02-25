package day01.reflect;

import day01.domain.Person;

import java.lang.reflect.Field;

/**
 * @author Gakki
 * @date 2018/10/25 - 10:37
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("====");
        Field a = personClass.getField("a");
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        a.set(p, "Gakki");
        System.out.println(p);

        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        Field d = personClass.getDeclaredField("d");
        d.setAccessible(true);
        System.out.println(d.get(p));
    }
}
