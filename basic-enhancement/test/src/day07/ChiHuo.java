package day07;

/**
 * @author Jin
 * @date 2018/10/14 - 13:11
 */
//吃货类是一个线程类，可以继承thread
public class ChiHuo extends Thread {
    //1.需要在成员位置创建一个包子变量
    private final BaoZi bz;

    //2.使用带参数的构造方法，为这个包子变量赋值
    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    //3.设置线程任务（run）：吃包子
    @Override
    public void run() {
        int count = 0;
        //让吃货一直吃十次包子
        for (int i = 0; i < 10; i++) {
            //必须保证两个线程只能有一个在执行
            synchronized (bz) {
                //对包子的状态进行判断
                if (bz.flag == false) {
                    //吃货调用wait方法进入等待状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //被唤醒之后执行代码吃包子
                System.out.println("吃货正在吃："+bz.pi+bz.xian+"的包子");
                //吃货吃完包子后，修改状态为false
                bz.flag = false;
                //吃货唤醒包子铺线程，生产包子
                bz.notify();
                System.out.println("吃货已经报："+bz.pi+bz.xian+"的包子吃完了，包子铺重新开始生产包子");
                System.out.println("===============================");
            }
        }
    }
}
