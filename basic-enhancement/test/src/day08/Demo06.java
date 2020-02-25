package day08;

import java.io.File;

/**
 * @author Gakki
 * @date 2018/10/15 - 16:59
 */
public class Demo06 {
    public static void main(String[] args){
        File file = new File("G:\\迅雷下载\\");
        getAllFile(file);

    }

    private static void getAllFile(File dir) {
        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                getAllFile(f);
            } else {
                System.out.println(f);
            }
        }

    }
}
