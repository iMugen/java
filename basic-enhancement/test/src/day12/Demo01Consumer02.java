package day12;


import java.util.function.Consumer;

/**
 * @author Gakki
 * @date 2018/10/21 - 9:37
 */
public class Demo01Consumer02 {
    public static void main(String[] args) {
        method("鱼香肉丝",
                s -> System.out.println("大哥吃：" + s.substring(0, 2)),
                s -> System.out.println("小弟吃：" + s.substring(2))
        );
    }

    private static void method(String str, Consumer<String> c1, Consumer<String> c2) {
        c1.andThen(c2).accept(str);
    }
}
