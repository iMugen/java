package day08.hw;

import java.io.File;

/**
 * @author Gakki
 * @date 2018/10/19 - 9:08
 */
public class Hw14 {
    public static void main(String[] args){
        // 1.指定文件夹路径,如果是文件则输出文件大小，如果是文件夹，
        // 则计算该文件夹下所有文件大小之和并输出
        long sum = getDirLength(new File("G:\\黑马\\基础加强\\day13\\"));
        System.out.println(sum);
    }

    private static long getDirLength(File dir) {
        long sum = 0;
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    sum += file.length();
                } else {
                    sum += getDirLength(file);
                }
            }
        }
        return sum;
    }
}
