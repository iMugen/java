package day08.hw;

import java.io.File;
import java.util.Scanner;

/**
 * @author Gakki
 * @date 2018/10/15 - 22:00
 */
public class Hw09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件夹目录");
        String next = sc.next();

        File file = new File(next);
        if (file.isFile()) {
            System.out.println(file.length());
        }
        if (file.isDirectory()) {
            long sum = 0;
            File[] files = file.listFiles();
            for (File f : files) {
                if (f.isFile()) {
                    sum += f.length();
                }
            }
            System.out.println(sum);
        }
    }
}
