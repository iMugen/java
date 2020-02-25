package day04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author Jin
 * @date 2018/10/10 - 11:39
 */
public class Work02 {
    public static void main(String[] args) {
//        四、往一个Map集合中添加若干元素。获取Map中的所有value，并使用增强for和迭代器遍历输出每个value。
//tips: 参阅Map接口中values()方法

        HashMap<String, String> map = new HashMap<>();

        map.put("Qiang Liu", "Gakki");
        map.put("Daniel", "Melody");
        map.put("Jin", "Mugen");

        Collection<String> values = map.values();

        for (String value : values) {
            System.out.println(value);
        }

        System.out.println("------");

        Iterator<String> itr = values.iterator();
        while (itr.hasNext()) {
//            System.out.println(itr.next());
            String s = itr.next();
            System.out.println(s);
        }
    }
}
