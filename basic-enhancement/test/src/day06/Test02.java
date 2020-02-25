package day06;

/**
 * @author Jin
 * @date 2018/10/12 - 10:35
 */
public class Test02 {
    public static void main(String[] args){
        MyRunnable mr = new MyRunnable();

        Thread t = new Thread(mr);
        t.setName("Gakki");
        t.start();
    }
}
