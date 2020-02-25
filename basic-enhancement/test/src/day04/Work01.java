package day04;

import java.util.HashMap;

/**
 * @author Jin
 * @date 2018/10/10 - 11:28
 */
public class Work01 {
    public static void main(String[] args){
//  三、请使用Map集合的方法完成添加元素，根据键删除，以及根据键获取值操作。
        HashMap<String, String> map = new HashMap<>();

        map.put("Qiang Liu", "Gakki");
        map.put("Daniel", "Melody");

        System.out.println(map);

        map.put("Jin", "Mugen");
        System.out.println(map);

        map.remove("Jin");
        System.out.println(map);

        System.out.println(map.get("Daniel"));

    }
}
