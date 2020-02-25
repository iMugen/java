package day03.hw;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**十、已知数组存放一批QQ号码，QQ号码最长为11位，
 * 最短为5位String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
 * 将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印出来。
 * @author Gakki
 * @date 2018/10/28 - 9:34
 */
public class Hw10 {
    public static void main(String[] args){
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        LinkedList<String> list = new LinkedList<>();
        for (String qq : strs) {
            if (!list.contains(qq)) {
                list.add(qq);
            }
        }

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    public static void method1() {
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        LinkedList<String> linkedList = new LinkedList<>();
        Collections.addAll(linkedList,strs);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < linkedList.size(); i++) {
            String s = linkedList.get(i);
            linkedHashSet.add(s);
        }
        for (String s : linkedHashSet) {
            System.out.println(s);
        }
        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
