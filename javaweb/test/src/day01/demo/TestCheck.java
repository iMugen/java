package day01.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 简单的测试框架
 *
 * @author Gakki
 * @date 2018/10/25 - 19:27
 */
public class TestCheck {
    public static void main(String[] args) throws IOException {
        //1.创建计算器对象
        Calculator calculator = new Calculator();
        //2.获取字节码文件
        Class cls = calculator.getClass();
        //3.获取所有方法
        Method[] methods = cls.getMethods();

        //异常出现的次数
        int num = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));

        for (Method method : methods) {
            //4.判断方法上是否有Check注解
            if (method.isAnnotationPresent(Check.class)) {
                //5.有，执行
                try {
                    method.invoke(calculator);
                } catch (Exception e) {
                    //6.捕获异常

                    //记录文件信息
                    num++;

                    bw.write(method.getName()+"方法出异常了");
                    bw.newLine();
                    bw.write("异常的名称："+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因："+e.getMessage());
                    bw.newLine();
                    bw.write("==============");
                    bw.newLine();
                }
            }
        }
        bw.write("本次共出现了"+num+"次异常");
        bw.flush();
        bw.close();
    }
}
