package day06;

/**
 * @author Jin
 * @date 2018/10/14 - 20:07
 */
// 1.定义一个隧道类实现Runnable接口
public class Tunnel implements Runnable {
    // 2.定义一个变量来记录通过隧道的人数
    int crossNum = 0;

    // 3.重写run()方法
    @Override
    public void run() {
        // 4.调用通过隧道的方法
        cross();
    }

    //定义一个同步方法，模拟每个人通过隧道需要5分钟
    private synchronized void cross() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //改变通过的人次
        crossNum++;
        System.out.println(Thread.currentThread().getName()
                + "已经通过隧道,它是第" + crossNum + "通过的");
    }

}
