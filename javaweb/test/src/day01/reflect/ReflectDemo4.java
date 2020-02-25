package day01.reflect;


import day01.domain.Person;

import java.lang.reflect.Method;

public class ReflectDemo4 {

    /**
     * Class对象功能：
     * 获取功能：
     * 1. 获取成员变量们
     * Field[] getFields()
     * Field getField(String name)
     * <p>
     * Field[] getDeclaredFields()
     * Field getDeclaredField(String name)
     * 2. 获取构造方法们
     * Constructor<?>[] getConstructors()
     * Constructor<T> getConstructor(类<?>... parameterTypes)
     * <p>
     * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
     * Constructor<?>[] getDeclaredConstructors()
     * 3. 获取成员方法们：
     * Method[] getMethods()
     * Method getMethod(String name, 类<?>... parameterTypes)
     * <p>
     * Method[] getDeclaredMethods()
     * Method getDeclaredMethod(String name, 类<?>... parameterTypes)
     * <p>
     * 4. 获取类名
     * String getName()
     */

    public static void main(String[] args) throws Exception {

        //0.获取Person的Class对象
        Class personClass = Person.class;
        /*
          3. 获取成员方法们：
             * Method[] getMethods()
             * Method getMethod(String name, 类<?>... parameterTypes)

             * Method[] getDeclaredMethods()
             * Method getDeclaredMethod(String name, 类<?>... parameterTypes)
         */

        Method eat = personClass.getMethod("eat");
        Person p = new Person();
        eat.invoke(p);

        Method eat1 = personClass.getMethod("eat", String.class);
        eat1.invoke(p, "rice");

        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            System.out.println(method.getName());
        }
        System.out.println(personClass.getName());
    }

}
