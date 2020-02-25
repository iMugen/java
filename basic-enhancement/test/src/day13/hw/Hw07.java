package day13.hw;

import java.util.stream.Stream;

/**
 * @author Gakki
 * @date 2018/10/23 - 14:59
 */
public class Hw07 {
    public static void main(String[] args){
//        已知数组arr1中有如下元素{郭靖，杨康}，arr2中有如下元素{黄蓉，穆念慈}，
//        使用Stream将二者合并到List集合
        String[] arr1 = {"liuqiang", "Gakki"};
        String[] arr2 = {"Jin", "Mugen"};
        Stream<String> s1 = Stream.of(arr1);
        Stream<String> s2 = Stream.of(arr2);
        Stream.concat(s1,s2).forEach(s -> System.out.println(s));
    }
}
