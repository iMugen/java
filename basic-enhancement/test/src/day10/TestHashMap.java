package day10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Gakki
 * @date 2018/10/18 - 21:58
 */
public class TestHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(9, "Gakki");
        map.put(7, "hh");
        map.put(2, "iadjhoa");
        map.put(4, "iojn");

        /*Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " --- " + value);
        }*/


        /*Set<Integer> set = map.keySet();
        for (Integer integer : set) {
            System.out.print(map.get(integer));
            System.out.println(integer);
        }*/


        for (Integer integer : map.keySet()) {
            System.out.println(integer+"---"+map.get(integer));
        }
    }
}
