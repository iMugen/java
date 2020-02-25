package day08;

import java.io.File;

/**
 * @author Gakki
 * @date 2018/10/17 - 19:59
 */
public class FileFilter {
    public static void main(String[] args){
        File file = new File("G:\\黑马\\基础班课程资料\\作业和知识点\\");
        getJavaFile(file);
    }

    private static void getJavaFile(File file) {
        // 获取ddd1下的内容，并根据filefilter的条件进行过滤
        File[] files = file.listFiles(new java.io.FileFilter() {
            @Override
            public boolean accept(File pathname) {// 此方法会先获得所有的内容，然后遍历所有的内容，一次去调用accept方法
                return pathname.isDirectory() || pathname.getName().endsWith(".java");
            }
        });

        for (File f : files) {
            if (f.isFile()) {
                System.out.println(f);
            } else {
                getJavaFile(f);
            }
        }
    }
}
