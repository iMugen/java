package day13.hw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author Gakki
 * @date 2018/10/23 - 12:48
 */
public class Hw02 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        map.put("岑小村", 59);
        map.put("谷天洛", 82);
        map.put("渣渣辉", 98);
        map.put("蓝小月", 65);
        map.put("皮几万", 70);

        Collection<Integer> values = map.values();
//        values.stream().map
    }
}

