package day05.work09;

/**
 * @author Jin
 * @date 2018/10/11 - 23:21
 */
public class Test {
    public static void main(String[] args){
//        创建多线程对象，开启多线程。在子线程中输出1-100之间的偶数，主线程输出1-100之间的奇数。
        MyThread mt = new MyThread();
        mt.start();

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println("主线程输出奇数：" + i);
            }
        }
    }
}
