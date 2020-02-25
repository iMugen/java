package day05;

/**
 * @author Jin
 * @date 2018/10/11 - 17:15
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("mt" + i);
        }
    }
}
