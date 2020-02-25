package day07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Jin
 * @date 2018/10/14 - 14:59
 */
public class ThreadPool {
    public static void main(String[] args){
        //1.创建线程池对象
        ExecutorService pool = Executors.newFixedThreadPool(3);

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        //2.提交任务
        pool.submit(r);
        pool.submit(r);
        pool.submit(r);
        pool.submit(r);
        pool.submit(r);

        //3.在执行完任务后关闭整个线程池
        pool.shutdown();
    }
}
