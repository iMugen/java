package day01;

/**
 * @author Gakki
 * @date 2018/10/24 - 10:53
 */
public class Demo02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Demo02.class;

        Demo02 d1 = new Demo02();
        Class c2 = d1.getClass();

        Class c3 = Class.forName("day01.Demo02");

        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
    }
}
