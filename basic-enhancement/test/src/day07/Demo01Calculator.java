package day07;

/**
 * @author Jin
 * @date 2018/10/14 - 16:49
 */
public class Demo01Calculator {
    public static void main(String[] args){
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });


        invokeCalc(100, 200,(int a, int b) -> {
                return a+b;
        });

        invokeCalc(300, 700,(a, b) -> a+b);

    }

    private static void invokeCalc(int a,int b,Calculator c) {
        int sum = c.calc(a, b);
        System.out.println(sum);

    }
}
