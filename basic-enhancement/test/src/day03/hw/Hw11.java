package day03.hw;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**十一、键盘录入一个字符串，去掉其中重复字符，打印出不同的那些字符，必须保证顺序。例如输入：aaaabbbcccddd，打印结果为：abcd。
 * @author Gakki
 * @date 2018/10/28 - 10:33
 */
public class Hw11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input words:");
        String s = sc.next();

        LinkedHashSet<Character> list = new LinkedHashSet<>();
        for (char c : s.toCharArray()) {
            list.add(c);
        }
//        System.out.println(list);
        for (Character character : list) {
            System.out.print(character);
        }
    }
}
