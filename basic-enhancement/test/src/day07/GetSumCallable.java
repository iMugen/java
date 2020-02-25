package day07;

import java.util.concurrent.Callable;

/**
 * @author Jin
 * @date 2018/10/14 - 22:48
 */
public class GetSumCallable implements Callable<Integer> {
    private int a;

    public GetSumCallable(int a) {
        this.a = a;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
