package day13.hw;

import java.util.stream.Stream;

/**
 * @author Gakki
 * @date 2018/10/23 - 13:34
 */
public class Hw06 {
    public static void main(String[] args){
//        有如下整数1,-2,-3,4,-5
//        使用Stream取元素绝对值并打印
        Integer[] arr = {1,-2,-3,4,-5};

        Stream<Integer> stream = Stream.of(arr);
//        stream.map(integer -> integer)
    }
}
