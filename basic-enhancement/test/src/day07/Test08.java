package day07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Jin
 * @date 2018/10/15 - 9:59
 */
public class Test08 {
    public static void main(String[] args) {
        //创建线程池对象
        /*ExecutorService pool = Executors.newFixedThreadPool(2);
        //创建Runnable实例对象
        MyRunnable r = new MyRunnable();
        pool.submit(r);
        pool.submit(r);
        pool.submit(r);*/
        ExecutorService pool = Executors.newFixedThreadPool(2);

        Runnable r = new Runnable() {
            @Override
            public void run() {
                synchronized ("") {
                    try {
                        System.out.println("I need a teacher");
                        Thread.sleep(2000);
                        System.out.println(Thread.currentThread().getName() + "teached english,go back");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        pool.submit(r);
        pool.submit(r);
        pool.submit(r);
        pool.submit(r);
        pool.submit(r);
        pool.submit(r);

    }
}
