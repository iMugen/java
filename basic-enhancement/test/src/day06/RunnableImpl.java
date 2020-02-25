package day06;

/**
 * @author Jin
 * @date 2018/10/12 - 15:10
 */
public class RunnableImpl implements Runnable {
    private int ticket = 100;
    private Object obj = new Object();

    @Override
    public void run() {
        while (true) {

                method();
        }
    }

    public synchronized void method() {
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
            ticket--;
        }
    }
}
