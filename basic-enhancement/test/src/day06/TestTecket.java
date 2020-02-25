package day06;

/**
 * @author Jin
 * @date 2018/10/12 - 15:14
 */
public class TestTecket {
    public static void main(String[] args){
        RunnableImpl r = new RunnableImpl();

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.start();
        t2.start();
        t3.start();
    }
}
