package day01.reflect;

import day01.domain.Person;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**框架类
 * @author Gakki
 * @date 2018/10/25 - 15:35
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //1.加载配置文件
        //1.1创建properties对象
        Properties pro = new Properties();
        //1.2加载配置文件，转换为集合
        //1.2.1获取class目录下的文件
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        //2.获取文件中的value
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //3.加载该类进内存
//        Class cls = Class.forName(className);
        Class cls = Person.class;
        //4.创建对象
        Object obj = cls.newInstance();
        //5.获取方法对象
        Method sleep = cls.getMethod(methodName);
        //6.调用方法
        sleep.invoke(obj);

    }
}
