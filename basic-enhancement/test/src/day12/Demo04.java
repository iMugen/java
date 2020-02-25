package day12;

import java.util.function.Consumer;

/**
 * @author Gakki
 * @date 2018/10/21 - 15:06
 */
public class Demo04 {
    public static void main(String[] args) {
        method((str) -> {
                    System.out.println(str.substring(0, 2));
                }, (str) -> {
                    System.out.println(str.substring(2));
                }
        );
    }

    private static void method(Consumer<String> c1, Consumer<String> c2) {
        String str = "慕容白";
        c1.andThen(c2).accept(str);
    }
}
