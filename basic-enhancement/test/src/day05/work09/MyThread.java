package day05.work09;

/**
 * @author Jin
 * @date 2018/10/11 - 23:17
 */
//    创建多线程对象，开启多线程。在子线程中输出1-100之间的偶数，主线程输出1-100之间的奇数。
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("在子线程中输出得偶数是：" + i);
            }
        }
    }
}
