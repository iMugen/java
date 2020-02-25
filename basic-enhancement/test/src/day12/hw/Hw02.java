package day12.hw;

/**
 * @author Gakki
 * @date 2018/10/21 - 21:32
 */
public class Hw02 {
//    1.	定义一个函数式接口IntCalc,其中抽象方法int calc(int a , int b)，使用注解@FunctionalInterface
//2.	在测试类中定义static void getProduct(int a , int b ,IntCalc calc), 该方法的预期行为是使用calc得到a和b的乘积并打印结果
//3.	测试getProduct(),通过lambda表达式完成需求

    public static void main(String[] args) {
        /*getProduct(10, 20, (t, y) -> t * y);

        IntCalc intCalc = new IntCalc() {
            @Override
            public int calc(int a, int b) {
                return 0;
            }
        };
*/
        getProduct(10, 20, new IntCalc() {
            @Override
            public int calc(int a, int b) {
                return a*b;
            }
        });
    }

    public static void getProduct(int a, int b, IntCalc intCalc) {
        System.out.println(intCalc.calc(a, b));
    }

}
