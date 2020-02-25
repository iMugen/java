package day08;

import java.io.File;

/**
 * @author Gakki
 * @date 2018/10/15 - 16:59
 */
public class Demo07 {
    public static void main(String[] args) {
        File file = new File("D:\\BaiduYunDownload\\黑马Java\\Java基础\\day14\\day14\\");
        getJavaFile(file);
    }

    private static void getJavaFile(File dir) {
        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                getJavaFile(f);
            } else {
                String name = f.getName();
                if (name.endsWith(".java")) {
                    System.out.println(name);
                }
            }
        }

    }
}
