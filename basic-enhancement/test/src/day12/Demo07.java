package day12;

import java.util.function.Predicate;

/**
 * @author Gakki
 * @date 2018/10/21 - 16:31
 */
public class Demo07 {
    public static void main(String[] args){
//        method(
//
//        );
    }

    private static void method(Predicate<String> p1,Predicate<String> p2) {
        String str = "马尔扎哈，男，31";
        if (p1.and(p2).test(str)) {
            System.out.println(str);
        }

    }
}
