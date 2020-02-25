package day08;

import java.io.File;
import java.io.FileFilter;

/**
 * @author Gakki
 * @date 2018/10/15 - 18:41
 */
public class Demo08 {
    public static void main(String[] args){
        File file = new File("G:\\黑马\\基础加强\\day08\\");
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java");
            }
        });

        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
