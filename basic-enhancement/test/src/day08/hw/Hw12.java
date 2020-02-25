package day08.hw;

import java.io.File;
import java.io.FileFilter;

/**
 * @author Gakki
 * @date 2018/10/15 - 22:44
 */
public class Hw12 {
    public static void main(String[] args) {
        //创建file对象
        File dir = new File("G:\\黑马\\基础加强\\day12\\");
        //调用打印目录方法
//        printDir(dir);
//        printDir2(dir);
        printDir3(dir);
    }

    private static void printDir3(File dir) {
//        File[] files = dir.listFiles(pathname -> pathname.getName().endsWith(".java") || pathname.isDirectory());
        File[] files = dir.listFiles(pathname -> pathname.getName().endsWith(".java") || pathname.isDirectory());
        for (File file : files) {
            if (file.isFile()) {
                System.out.println("文件名:" + file.getName());
            } else {
                printDir3(file);
            }
        }

    }

    private static void printDir2(File dir) {
        //匿名内部类方式创建过滤器子类对象
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java") || pathname.isDirectory();
            }
        });

        // 循环打印
        for (File file : files) {
            if (file.isFile()) {
                System.out.println("文件名" + file.getName());
            } else {
                printDir2(file);
            }
        }

    }

    private static void printDir(File dir) {
        //获取子文件和目录
        File[] files = dir.listFiles();
        //循环打印
        for (File file : files) {
            if (file.isFile()) {
                //如果是文件，判断文件名并输出文件绝对路径
                if (file.getName().endsWith(".java")) {
                    System.out.println("文件名" + file.getAbsolutePath());
                }
            } else {
                printDir(file);
            }
        }
    }
}
