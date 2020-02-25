package day12;

import java.io.File;
import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @author Gakki
 * @date 2018/10/21 - 16:02
 */
public class Demo06Filter {
    public static void main(String[] args){
        File dir = new File("D:\\IDM");
        File[] files = dir.listFiles();

    }

    private static File[] filter(File[] files,Predicate<File> p) {
        // 1.定义一个ArrayList存放留下的File对象
        ArrayList<File> list = new ArrayList<>();
        for (File file : files) {
            if (p.test(file)) {
                list.add(file);
            }
        }
        return list.toArray(new File[list.size()]);
    }

}
