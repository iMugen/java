package day06.work06;

/**
 * @author Jin
 * @date 2018/10/14 - 8:51
 */
public class SubThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("子线程执行");
        }
    }
}
