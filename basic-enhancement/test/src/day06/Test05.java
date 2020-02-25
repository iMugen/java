package day06;

/**
 * @author Jin
 * @date 2018/10/12 - 16:53
 */
public class Test05 {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread("Gakki") {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println(Thread.currentThread().getName()+"work done,sleep---");
                    try {
//                        obj.wait(5000);
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("who wake me up");
                }
            }
        }.start();

        new Thread("Jin"){
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("准备叫醒睡觉的哥们");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("hhh");
                    obj.notify();
                }
            }
        }.start();


    }
}
