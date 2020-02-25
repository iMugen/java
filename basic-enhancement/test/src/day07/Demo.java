package day07;

/**
 * @author Jin
 * @date 2018/10/14 - 13:00
 */
public class Demo {
    public static void main(String[] args){
        //创建包子对象
        BaoZi bz = new BaoZi();
        //创建包子铺线程，开启，生产包子
        new BaoZiPu(bz).start();
        //创建吃货线程，开启，吃包子
        new ChiHuo(bz).start();
    }
}
