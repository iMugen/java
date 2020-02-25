package day06;

/**
 * @author Jin
 * @date 2018/10/12 - 9:51
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + ":" + i);
        }
    }

}
