package day13;

/**
 * @author Gakki
 * @date 2018/10/23 - 16:01
 */
public class Test1 {
    public static void main(String[] args){
        method(Integer::parseInt);
    }
    public static void method(InterA i){
        System.out.println(i.changeType("100")+100);
    }
}
