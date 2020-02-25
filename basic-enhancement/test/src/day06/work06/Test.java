package day06.work06;

/**
 * @author Jin
 * @date 2018/10/14 - 8:48
 */
public class Test {
    public static void main(String[] args) {
        SubThread s = new SubThread();
        Thread t = new Thread(s);
        t.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程执行");

        }
    }
}
