package day06;

/**
 * @author Jin
 * @date 2018/10/14 - 20:18
 */
public class TestTunnel {
    public static void main(String[] args){
        Tunnel tun = new Tunnel();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(tun,"p"+i);
            t.start();
        }
    }
}
