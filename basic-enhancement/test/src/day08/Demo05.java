package day08;

import java.io.File;
import java.util.Scanner;

/**
 * @author Gakki
 * @date 2018/10/15 - 15:30
 */
public class Demo05 {
    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
//        System.out.println(sum(100));
    }

    private static int sum(int i) {
        if (i == 1) {
            return 1;
        }

        return i + sum(i - 1);
    }

    private static void test3() {
        // 1.录入一个地址路径
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件夹目录");
        String path = sc.next();

        // 2.用file对象与path路径关联
        File file = new File(path);

        // 3.判断录入的路径是否是一个文件夹路径
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

    public static void test1() {
        // 1.录入一个地址路径
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件夹目录");
        String path = sc.next();

        // 2.用file对象与path路径关联
        File file = new File(path);

        // 3.判断录入的路径是否是一个文件夹路径
        if (file.isDirectory()) {
            // 4.获取文件夹下所有内容
            File[] files = file.listFiles();
            // 5.遍历数组，获取每个file对象并输出
            for (File f : files) {
                System.out.println(f.getName());
            }
        }
    }
}
