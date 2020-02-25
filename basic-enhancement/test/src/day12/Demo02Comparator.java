package day12;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 类似地，如果一个方法的返回值类型是一个函数式接口，那么就可以直接返回一个Lambda表达式。当需要通过一
 * 个方法来获取一个 java.util.Comparator 接口类型的对象作为排序器时,就可以调该方法获取。
 * @author Gakki
 * @date 2018/10/21 - 10:58
 */
public class Demo02Comparator {
    /**
     * 定义一个方法，方法的返回值类型使用函数式接口Comparator
     * @return
     */
    public static Comparator<String> getComparator(){
        // 方法的返回值类型是一个接口，那我们可以返回这个接口的匿名内部类
        /*return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 按照字符串长度降序排序
                return o1.length() - o2.length();
            }
        };*/
        return (o1, o2) -> o1.length() - o2.length();
    }

    public static void main(String[] args){
        // 创建一个字符串数组
        String[] arr = {"a", "bb", "cccccc", "ddd"};
        // 调用Arrays中的sort方法，对字符串进行排序
        Arrays.sort(arr,getComparator());
        // 打印排序后的数组
        System.out.println(Arrays.toString(arr));
    }
}
