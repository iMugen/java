package day03.hw;

import java.util.*;

/**八、使用LinkedHashSet存储以下元素："王昭君","王昭君","西施","杨玉环","貂蝉"。使用迭代器和增强for循环遍历LinkedHashSet。
 * @author Gakki
 * @date 2018/10/28 - 9:19
 */
public class Hw08 {
    public static void main(String[] args){
        HashSet<String> list = new HashSet<>();
        Collections.addAll(list,"王昭君","王昭君","西施","杨玉环","貂蝉");
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void test1() {
        LinkedHashSet<String> list = new LinkedHashSet<>();
        Collections.addAll(list,"王昭君","王昭君","西施","杨玉环","貂蝉");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
