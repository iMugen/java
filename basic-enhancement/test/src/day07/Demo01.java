package day07;

/**
 * @author Jin
 * @date 2018/10/14 - 15:42
 */
public class Demo01 {
    public static void main(String[] args){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类方式");
            }
        };

        Runnable r1 = () ->{
            System.out.println("lambda方式");
        };

        new Thread(r1).start();
    }
}
