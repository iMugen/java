package day01.annotation;


import java.lang.reflect.Method;

/**
 *
 */
@Pro(className = "day01.annotation.Demo1",methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
//            前提：不能改变该类的任何代码。可以创建任意类的对象，可以执行任意方法
        //1.解析注解
        //1.1获取该累的字节码文件对象
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        //2.获取上边的注解对象
        Pro anno = reflectTestClass.getAnnotation(Pro.class);
        //3.调用注解对象中定义的抽象方法，获取返回值
        String className = anno.className();
        String methodName = anno.methodName();

        //加载进内存
        Class cls = Class.forName(className);
        //创建对象
        Object o = cls.newInstance();
        //获取方法对象
        Method method = cls.getMethod(methodName);
        //调用方法
        method.invoke(o);
    }
}
