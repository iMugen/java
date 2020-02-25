package day12.hw;

/**
 * @author Gakki
 * @date 2018/10/22 - 9:05
 */

import java.util.Random;

/**
 * 2.	定义一个函数式接口NumberSupplier,其中抽象方法int getNum(int...nums)，使用注解@FunctionalInterface
 * 3.	在测试类中定义static void getRandomNumFromOneToNum(int num , NumberSupplier ns), 该方法的预期行为是使用ns得到一个从1到num(包含1和num)之间的随机数并打印
 * 4.	在测试类中定义static void getRandomNumFromAToB(int a ,int b, NumberSupplier ns), 该方法的预期行为是使用ns得到一个从a到b(包含a和b)之间的随机数并打印
 * 5.	在测试类中定义static void getRandomNumFromArray(int[] nums, NumberSupplier ns), 该方法的预期行为是使用ns从数组nums中获取一个随机元素并打印
 * 6.	主方法中测试调用以上三个方法，使用方法引用完成需求
 */
public class Hw04 {
    public static void getRandomNumFromOneToNum(int num, NumberSupplier ns) {
        System.out.println(ns.getNum(num));
    }
    public static void getRandomNumFromAToB(int a ,int b, NumberSupplier ns) {
        System.out.println(ns.getNum(a, b));
    }
    public static void getRandomNumFromArray(int[] nums, NumberSupplier ns) {
        System.out.println(ns.getNum(nums));
    }


    public static void main(String[] args) {
        Hw04.RandomUtil ru = new Hw04().new RandomUtil();
        getRandomNumFromOneToNum(10, (nums) -> ru.nextInt(nums[0]));
        getRandomNumFromAToB(10,20,(nums -> ru.nextInt(nums[1])));
//        getRandomNumFromArray([2,4,5],(nums -> ru.nextInt(nums)));


        /*getRandomNumFromOneToNum(10, new NumberSupplier() {
            @Override
            public int getNum(int... nums) {
                return 0;
            }
        });*/
    }


    public class RandomUtil {
        private Random random = new Random();

        public int nextInt(int... nums) {
            if (nums == null || nums.length == 0) {
                throw new RuntimeException("pls认真一点！");
            }
            //生成1到nums[0](包含1和nums[0])之间的随机数
            if (nums.length == 1) {
                return random.nextInt(nums[0]) + 1;
            }

            //生成nums[0]到nums[1](包含nums[0]和nums[1])之间的随机数
            if (nums.length == 2) {
                return random.nextInt(nums[1] + 1 - nums[0]) + nums[0];
            }

            //从数组nums中取出一个随机元素
            return nums[random.nextInt(nums.length)];
        }

    }


}
