package day01;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author Gakki
 * @date 2018/10/24 - 15:36
 */
public class Demo05 {
    public static void main(String[] args) throws Exception {
        // 创建Properties对象
        Properties p = new Properties();
        // 通过类加载器过获取指定路径
        InputStream is = Demo05.class.getClassLoader().getResourceAsStream("pro.properties");
        // 将文件中的数据加载到Properties集合中
        p.load(is);

        // 获取类名和方法名
        String className = p.getProperty("className");
        String methodName = p.getProperty("methodName");

        // 通过类名获取字节码对象
        Class cls = Class.forName(className);
        // 创建一个此类对象
        Object person = cls.newInstance();

        //通过字节码对象获取方法对象
        Method method = cls.getMethod(methodName);

        //执行方法
        method.invoke(person);

    }
}
