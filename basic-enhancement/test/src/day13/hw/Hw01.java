package day13.hw;

import java.util.stream.Stream;

/**
 * @author Gakki
 * @date 2018/10/23 - 11:02
 */
public class Hw01 {
    public static void main(String[] args) {
//        a)	使用lambda表达式创建Predicate对象p1,p1能判断整数是否是自然数(大于等于0)
//        b)	使用lambda表达式创建Predicate对象p2,p2能判断整数的绝对值是否大于100
//        c)	使用lambda表达式创建Predicate对象p3,p3能判断整数是否是偶数
        Integer[] arr = {-12345, 9999, 520, 0, -38, -7758520, 941213};

        int a = -1;

        Stream<Integer> stream = Stream.of(arr);
//        stream.filter(integer -> integer >= 0).forEach(integer -> System.out.println(integer));
//        stream.filter(integer -> )
        stream.filter(integer -> integer %2==0).forEach(integer -> System.out.println(integer));
    }
}
