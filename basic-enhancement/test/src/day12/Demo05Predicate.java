package day12;

import java.util.function.Predicate;

/**
 * @author Gakki
 * @date 2018/10/23 - 22:14
 */
public class Demo05Predicate {
    public static void main(String[] args){
        method("Gakki,female,36",
                s -> s.split(",")[1].equals("female"),
                s -> Integer.parseInt(s.split(",")[2]) > 30
                );
    }
    public static void method(String str,Predicate<String> p1,Predicate<String> p2){
        if (p1.and(p2).test(str)) {
            System.out.println(str);
        }
    }
}
