package day06;

/**
 * @author Jin
 * @date 2018/10/12 - 11:00
 */
public class Test03 {
    public static void main(String[] args) {
        new Thread("Gakki") {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(getName() + ":" + i);
                }
            }
        }.start();
    }
}
