package day12;

import java.util.function.Supplier;

/**
 * @author Gakki
 * @date 2018/10/21 - 11:28
 */
public class Demo03Test {
    public static void printMax(Supplier<Integer> sup) {
        System.out.println("最大值:" + sup.get());
    }

    public static void main(String[] args) {
        int[] arr = {100, 0, 13, -1, 4892, 88};
        printMax(() -> {
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
    }


}
