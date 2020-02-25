package day08.hw;

import java.io.File;

/**
 * @author Gakki
 * @date 2018/10/15 - 21:34
 */
public class Hw07 {
    public static void main(String[] args) {
        File file = new File("D:\\aaa\\b.txt");
        if (file.isFile()) {
            System.out.println("D:\\aaa\\b.txt" + "是一个文件");
        } else {
            System.out.println("不是一个文件夹");
        }
    }
}
