package day12;

import javax.naming.Name;
import java.util.function.Consumer;

/**
 * @author Gakki
 * @date 2018/10/21 - 9:37
 */
public class Demo01Consumer {
    public static void main(String[] args) {
        // 消费方式：直接输出字符串 sout(haha);
        // 消费方法：把字符串反转输出
        method("Gakki",s -> System.out.println(new StringBuffer(s).reverse()));
    }

    public static void method(String name,Consumer<String> c){
        c.accept(name);
    }
}
