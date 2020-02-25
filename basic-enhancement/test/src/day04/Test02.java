package day04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Jin
 * @date 2018/10/10 - 16:51
 */
public class Test02 {
    public static void main(String[] args){
/*
        要求：
        1.遍历集合，并将序号与对应人名打印。
        2.向该map集合中插入一个编码为5姓名为李晓红的信息
        3.移除该map中的编号为1的信息
        4.将map集合中编号为2的姓名信息修改为"周林"
*/
        // 1.定义一个map，key为编号，value为姓名
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");

        // 2.遍历集合，打印姓名
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            String value = map.get(key);
            System.out.println(key + "===" + value);
        }

        map.put(5, "李晓红");
        map.remove(1);
        map.put(2, "周林");

        System.out.println(map);


    }
}
