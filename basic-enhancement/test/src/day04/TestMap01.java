package day04;

import java.util.HashMap;

/**
 * @author Jin
 * @date 2018/10/10 - 18:40
 */
public class TestMap01 {
    public static void main(String[] args) {
        /*有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
        第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，
        将第一个数组元素作为key，第二个数组元素作为value存储到Map集合中。如{黑龙江省=哈尔滨, 浙江省=杭州, …}。*/
        String[] arr1 = {"黑龙江省", "浙江省", "江西省", "广东省", "福建省"};
        String[] arr2 = {"哈尔滨", "杭州", "南昌", "广州", "福州"};

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            String key = arr1[i];
            String value = arr2[i];

            map.put(key,value);
        }
        System.out.println(map);
    }
}
