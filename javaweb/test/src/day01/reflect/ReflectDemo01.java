package day01.reflect;

import day01.domain.Person;

/**
 * 获取字节码对象的三种方式
 * @author Gakki
 * @date 2018/10/25 - 11:30
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws Exception {
        //1.Class.forName("全类名")
        Class cls = Class.forName("day01.domain.Person");
        System.out.println(cls);
        //2.类名.class
        Class cls1 = Person.class;
        System.out.println(cls1);
        //3.对象.getClass()
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        System.out.println(cls==cls1);
        System.out.println(cls==cls3);

    }
}
