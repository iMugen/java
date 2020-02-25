package day06;

/**
 * @author Jin
 * @date 2018/10/12 - 10:33
 */
//        2.1 定义类实现Runnable
//        2.2 重写run方法
//        2.3 创建Runnable的实现类对象
//        2.4 创建一个Thread的对象，同时在构造中把Runnable的实现类对象当做参数传递进去
//        2.5 调用start方法启动线程
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
