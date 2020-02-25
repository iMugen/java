package day09.hw;

/**
 * @author Gakki
 * @date 2018/10/25 - 21:52
 */
public class TestThread {

    public static void main(String[] args) {
//        RunnableImpl r = new RunnableImpl();
//        for (int i = 0; i < 10; i++) {
//            new Thread(r,"张"+i).start();
//        }

        RunnableImpl2 r = new RunnableImpl2();
        new Thread(r, "官网").start();
        new Thread(r, "实体店").start();

//        有一个包包的数量为100个。分别从实体店和官网进行售卖！
//        要求使用多线程的方式，分别打印实体店和官网卖出包包的信息！
//        分别统计官网和实体店各卖出了多少个包包，例如：
//        官网共卖出了45个
//        实体店共卖出了55个
    }
}

class RunnableImpl2 implements Runnable {
    int count = 100;

    @Override
    public void run() {
        int i = 0;
        while (true) {
            synchronized ("") {
                if (count > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count--;
                    System.out.println(Thread.currentThread().getName() + "售出了一个包包，还剩" + (count) + "个包包");
                    i++;
                } else {
                    System.out.println(Thread.currentThread().getName() + "共计卖出了" + i + "个包包");
                    break;
                }
            }
        }

    }
}

