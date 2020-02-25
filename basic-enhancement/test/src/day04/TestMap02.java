package day04;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Jin
 * @date 2018/10/10 - 21:47
 */
public class TestMap02 {
    public static void main(String[] args){
        /*八、定义一个泛型为String类型的List集合，统计该集合中每个字符（注意，不是字符串）出现的次数。
        例如：集合中有”abc”、”bcd”两个元素，程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。*/
        // 1.定义ArrayList来存放元素
        ArrayList<String> list = new ArrayList<>();
        // 2.调用add方法添加元素
        list.add("abc");
        list.add("bcd");
        // 3.定义Hashmap，key是字符，value是字符对应的次数
        HashMap<Character, Integer> hm = new HashMap<>();
        // 4.使用增强for获取ArrayList的字符串
        for (String s : list) {
            // 5.将每个字符串转化为字符数组
            char[] chars = s.toCharArray();
            // 6.使用增强for遍历字符数组
            for (char ch : chars) {
                // 7.获取字符，去hashmap中计算次数
                Integer num = hm.get(ch);
                // 8.如果是字符为null，则是第一次出现，把次数设为1
                if (num == null) {
                    hm.put(ch,1);
                } else {
                // 9.如果之前有字符了，就把次数+1
                    hm.put(ch,num+1);
                }
            }
        }
        System.out.println(hm);
    }
}
