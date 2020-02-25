package day07.hw06;

/**
 * @author Jin
 * @date 2018/10/15 - 9:45
 */
public class Test {
    public int start = 1;
    public int end = 99;

    public static void main(String[] args) {
        new Test().method();
    }

    public void method() {
//请在此处插入代码，实现功能
        Runnable a = () -> {
            for (; start <= end; start++) {
                System.out.println(start);
            }
        };

        Thread t = new Thread(a);
        t.start();
    }
}
