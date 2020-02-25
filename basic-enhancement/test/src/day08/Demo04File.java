package day08;

import java.io.File;
import java.util.Scanner;

/**
 * @author Gakki
 * @date 2018/10/15 - 11:41
 */
public class Demo04File {
    public static void main(String[] args){
//        fileTest();
//        fileTest01();

        test();


    }

    private static void test() {

    }

    private static void fileTest01() {
        File f = new File("G:\\a.txt");
        System.out.println(f.mkdirs());
        System.out.println(f.delete());
    }

    public static void fileTest() {
        File f = new File("a.txt");
        System.out.println(f.exists());

        File f2 = new File("01_API");
        System.out.println(f2.exists());
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
    }
}
