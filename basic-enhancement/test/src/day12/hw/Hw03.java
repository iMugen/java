package day12.hw;

/**
 * @author Gakki
 * @date 2018/10/21 - 22:56
 */
public class Hw03 {
    public static void decToHex(int num,NumberToString nts){
        System.out.println(nts.convert(num));
    }

    public static void main(String[] args){
        decToHex(10, num -> Integer.toHexString(num));
    }
}
