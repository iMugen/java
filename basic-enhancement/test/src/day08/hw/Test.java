package day08.hw;

/**
 * @author Gakki
 * @date 2018/10/19 - 9:36
 */
public class Test {
    public static void main(String[] args) {
//        猴子吃桃子问题，猴子第一天摘下若干个桃子，当即吃了快一半，还不过瘾，又多吃了一个。
//        第二天又将仅剩下的桃子吃掉了一半，又多吃了一个。
//        以后每天都吃了前一天剩下的一半多一个。
//        到第十天，只剩下一个桃子。试求第一天共摘了多少桃子？
//        f(n) = (f(n+1))+1*2
        System.out.println(getTaoZi(1));
    }

    private static int getTaoZi(int n) {
        if (n < 0 || n > 10) {
            return -1;
        }
        if (n == 10) {
            return 1;
        }
        return (getTaoZi(n+1)+1)*2;
    }
}
