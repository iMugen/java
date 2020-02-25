package day06;

/**
 * @author Jin
 * @date 2018/10/12 - 11:05
 */
public class Test04 {
    public static void main(String[] args) {
        /*Runnable r = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        };

        new Thread(r, "iGakki").start();*/


        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }, "iiiiGakki").start();

    }
}
