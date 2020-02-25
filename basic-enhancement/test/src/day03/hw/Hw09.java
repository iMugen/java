package day03.hw;

import java.util.ArrayList;
import java.util.Collections;

/**九、ArrayList集合中有如下内容： {33,11,77,55}，使用Collections.sort()对ArrayList集合中的数据进行排序，并打印出排序后的结果。
 * @author Gakki
 * @date 2018/10/28 - 9:31
 */
public class Hw09 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,33,11,77,55);
        Collections.sort(list);
        System.out.println(list);
    }
}
