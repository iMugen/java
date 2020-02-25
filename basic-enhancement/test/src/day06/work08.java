package day06;

/**
 * @author Jin
 * @date 2018/10/14 - 20:02
 */
public class work08 extends Thread {

    int a = 5;

    public static void main(String[] args) {
        work08 thread = new work08();
        thread.start();
        for (int i = 1; i <= 20; i++) {
            System.out.println(Thread.currentThread().getName() + "执行第:" + i + "次");
        }
    }

    @Override
    public void run() {
        for (; a <= 20; a++) {
            System.out.println(Thread.currentThread().getName() + "执行第:" + a + "次");
        }
    }

}
