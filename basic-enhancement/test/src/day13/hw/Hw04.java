package day13.hw;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author Gakki
 * @date 2018/10/23 - 13:22
 */
public class Hw04 {
    public static void main(String[] args){
        String[] arr = {"黄药师","冯蘅","郭靖","黄蓉","郭芙","郭襄","郭破虏"};
        String[] arr1 = new String[7];

        Stream.of(arr).filter(s -> s.startsWith("黄")).forEach(s -> System.out.println(s));
    }
}
