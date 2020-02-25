package day08.hw;

import java.io.File;

/**
 * @author Gakki
 * @date 2018/10/15 - 21:34
 */
public class Hw06 {
    public static void main(String[] args){
        File file = new File("D:\\aaa\\b.txt");
        System.out.println(file.getName());

        System.out.println(file.length());

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile());


    }
}
