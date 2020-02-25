package day12;

import java.util.function.Supplier;

/**
 * 练习：求数组元素最大值
 *         使用Supplier接口作为方法参数类型，通过Lambda表达式求出int数组中的最大值。
 *         提示：接口的泛型请使用java.lang.Integer类。
 * @author Gakki
 */
public class Demo02Supplier {
   public static void main(String[] args){
      int arr[] = {2,3,4,52,333,23};
      // 调用getMax方法，参数传递lambda
      int a = getMax(() -> {
         int max = arr[0];
         for (int i : arr) {
            if (i > max) {
               max = i;
            }
         }
         return max;
      });
      System.out.println(a);
   }
   // 定义一个方法，参数传递supplier，泛型使用integer
   public static int getMax(Supplier<Integer> s){
      return s.get();
   }
}
