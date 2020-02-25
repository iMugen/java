package day08;

import java.io.File;

/**
 * @author Jin
 * @date 2018/10/15 - 10:15
 */
public class Demo01File {
    public static void main(String[] args){
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);

        String separator = File.separator;
        System.out.println(separator);

        // 通过父路径和子路径字符串
        String parent = "d:\\aaa";
        String child = "bbb.txt";
        File file3 = new File(parent, child);
        System.out.println(file3);

        File parentDir = new File("d:\\aaa");
        String child1 = "bbb.txt";
        File file4 = new File(parentDir, child1);
        System.out.println(file4);
    }
}
