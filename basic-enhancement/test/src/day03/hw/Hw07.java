package day03.hw;

import java.util.ArrayList;
import java.util.Collections;

/**七、向list集合添加姓名{张三,李四,王五,二丫,钱六,孙七},将二丫替换为王小丫。
 * @author Gakki
 * @date 2018/10/28 - 8:59
 */
public class Hw07 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三", "二丫","二丫","二丫");
//        list.set(1, "王小丫");
        /*for (String s : list) {
            if ("二丫".equals(s)) {
                list.set()
            }
        }*/
        for (int i = 0; i < list.size(); i++) {
            if ("二丫".equals(list.get(i))) {
                list.set(i, "二小丫");
            }
        }

        System.out.println(list);
    }
}
