package day04;

import java.util.HashMap;

/**
 * @author Jin
 * @date 2018/10/9 - 15:19
 */
public class Demo01 {
    public static void main(String[] args){
        String str=  "helloworldjavahehexixihaha";
/*
    统计的数据有两个：
        字符：出现的次数
    步骤：
        定义一个HashMap集合，其中键是字符，值就是出现的次数

        遍历字符串，拿到每次字符。
            判断此字符是否已经统计过 boolean containsKey(Object key)
                1. 如果统计过，再将之前的统计次数+1，设置回去
                2. 如果没有统计过，设置此字符出现的次数为1
 */
        HashMap<Character, Integer> map = new HashMap<>();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        System.out.println(map);
    }
}
