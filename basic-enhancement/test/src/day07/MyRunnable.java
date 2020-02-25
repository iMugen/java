package day07;

/**
 * @author Jin
 * @date 2018/10/15 - 10:04
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("我需要一个老师");
        synchronized ("") {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("老师来了"+Thread.currentThread().getName());
        System.out.println("教我java，教完后，回到了办公室");
    }
}
