package day04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Jin
 * @date 2018/10/10 - 15:31
 */
@SuppressWarnings("AlibabaCollectionInitShouldAssignCapacity")
public class TestCar {
    @SuppressWarnings("AlibabaCollectionInitShouldAssignCapacity")
    public static void main(String[] args) {
//        五、请使用Map集合存储自定义数据类型Car做键，对应的价格做值。并使用keySet和entrySet两种方式遍历Map集合。
//      2. 创建hashmap，key存car，value存price
        HashMap<Car, Integer> hm = new HashMap<>();
//      3. 添加汽车到hashmap中
        Car gtr = new Car("GTR", "black");
        Car camaro = new Car("Comaro", "yellow");
        Car mustang = new Car("Mustang", "black");

        hm.put(gtr, 1600000);
        hm.put(camaro, 300000);
        hm.put(mustang, 300000);
//      4. 用keyset遍历map
        Set<Car> cars = hm.keySet();
        for (Car car : cars) {
//      5. 根据key取value的值
            Integer i = hm.get(car);
            System.out.println(car.getName() + "---------" + car.getColor() + "---------" + i);
        }
        System.out.println("===============");

        // 6.用EntrySet方式遍历集合
        Set<Map.Entry<Car, Integer>> entries = hm.entrySet();
        for (Map.Entry<Car, Integer> entry : entries) {
            Car key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key.getName() + "========" + key.getColor() + "=========" + value);
        }



    }
}
