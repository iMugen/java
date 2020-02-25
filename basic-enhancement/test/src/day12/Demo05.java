package day12;

import java.util.function.Consumer;

/**
 * @author Gakki
 * @date 2018/10/21 - 15:20
 */
public class Demo05 {
    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男"};
        method(arr,
                (s) -> {
                    System.out.println("姓名:"+s.split(",")[0]);
                },
                (s) -> {
                    System.out.println("性别:"+s.split(",")[1]);
                });
    }

    private static void method(String[] arr, Consumer<String> c1, Consumer<String> c2) {
        for (String s : arr) {
            c1.andThen(c2).accept(s);
        }
    }
}
