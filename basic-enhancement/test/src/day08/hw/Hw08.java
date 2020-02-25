package day08.hw;

import java.io.File;

/**
 * @author Gakki
 * @date 2018/10/15 - 21:57
 */
public class Hw08 {
    public static void main(String[] args){
        File file = new File("D:\\");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
