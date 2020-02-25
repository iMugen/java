package day08.hw;

import java.io.File;

/**
 * @author Gakki
 * @date 2018/10/15 - 21:25
 */
public class Hw04 {
    public static void main(String[] args){
        File file = new File("D:\\ccc\\bbb\\aaa");
        System.out.println(file.mkdirs());
    }
}
