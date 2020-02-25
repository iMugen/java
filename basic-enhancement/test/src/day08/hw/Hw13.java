package day08.hw;

import java.io.File;
import java.util.Scanner;

/**
 * @author Gakki
 * @date 2018/10/16 - 10:11
 */
public class Hw13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入文件路径：");
        String next = sc.next();

        //把录入的内容作为文件夹路径对象
        File file = new File(next);
        // 获取文件目录（列表）
        File[] files = file.listFiles();
        // 遍历获得单个文件
        for (File f : files) {
            if (f.isFile()) {
                System.out.println(f.delete());
            }
        }

    }
}
