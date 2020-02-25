package day09;

/**
 * @author Gakki
 * @date 2018/10/17 - 19:47
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        // 获取当前毫秒值
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            String s = sb.append(i).append("黑马程序员").toString();
            System.out.println(s);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}
