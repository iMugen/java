package day06;

/**
 * @author Jin
 * @date 2018/10/12 - 23:43
 */
public class NameThread extends Thread{
    @Override
    public void run() {
        System.out.println(super.getName());
    }
}
