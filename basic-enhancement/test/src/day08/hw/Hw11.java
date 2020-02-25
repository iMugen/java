package day08.hw;

import java.io.File;
import java.util.Scanner;

/**
 * @author Gakki
 * @date 2018/10/17 - 9:49
 */
public class Hw11 {
    public static void main(String[] args) {
//        描述:
//        键盘录入一个文件夹路径，删除该文件夹以及文件夹路径下的所有文件。
//        要求：录入的文件夹里面要有多个文件，不能包含有子文件夹。
//        提示：如果文件夹里面有文件，则需要先将文件删除才能删除文件夹。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件夹路径：");
        String next = sc.next();
        File dir = new File(next);
        delDir(dir);


    }

    public static void delDir(File dir) {
        if (dir.isDirectory()) {
            // 判断如果是文件夹，就获取所有的子文件和文件夹
            File[] files = dir.listFiles();
            // 遍历所有内容目录
            for (File f : files) {
                //判断每一项如果是文件就删除
                if (f.isFile()) {
                    f.delete();
                } else {
                    // 如果是文件夹就递归调用
                    delDir(f);
                }
            }
            // 删除完毕所有文件后，把文件夹也删除
            dir.delete();
        } /*else {
            dir.delete();
        }*/
    }
}
