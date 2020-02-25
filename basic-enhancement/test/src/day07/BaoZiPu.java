package day07;

/**
 * @author Jin
 * @date 2018/10/14 - 11:22
 */
public class BaoZiPu extends Thread {
    // 1.需要创建一个包子变量
    private BaoZi bz;

    // 2.使用带参数的构造方法，为这个包子赋值
    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    // 3.设置线程任务，生产包子
    @Override
    public void run() {
        //定义一个变量
        int count = 0;
        for (int i = 0; i < 10; i++) {

            //使用同步技术保证两个线程只能有一个在执行
            synchronized (bz) {
                // 对包子的状态进行判断
                if (bz.flag == true) {
                    //包子铺调用wait方法进入等待状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //被唤醒之后执行，包子铺生产包子
                //增加一些趣味性：交替生产两种包子
                if (count % 2 == 0) {
                    bz.pi = "薄皮";
                    bz.xian = "三鲜馅";
                } else {
                    bz.pi = "冰皮";
                    bz.xian = "牛肉大葱馅";
                }
                count++;
                System.out.println("包子铺正在生产:" + bz.pi + bz.xian + "的包子");

                //生产一个包子所需要的时间
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //包子生产好了，把状态修改为true
                bz.flag = true;
                //唤醒吃货线程，让吃货线程吃包子
                bz.notify();
                System.out.println("包子铺生产好了：" + bz.pi + bz.xian + "的包子，吃货可以开始吃了");


            }
        }

    }
}
