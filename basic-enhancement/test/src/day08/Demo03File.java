package day08;

import java.io.File;

/**
 * @author Gakki
 * @date 2018/10/15 - 11:16
 */
public class Demo03File {
    /*获取功能：
    getAbsolutePath() 获取File对象所指向的文件或者文件夹的绝对路径
    getPath() 获取创建File对象的时候传递的路径
    getName() 获取文件或者文件夹的名称，如果有扩展名会包含扩展名
    length() 获取文件的大小
    注意：
    文件夹不能直接获取大小*/
    public static void main(String[] args){
        File f = new File("G:\\IdeaProjects\\shuangyuan\\test\\src\\day08\\Demo03File.java");
//    getAbsolutePath() 获取File对象所指向的文件或者文件夹的绝对路径
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getPath());
        System.out.println(f.getName());
        System.out.println(f.length());

        show01();
    }

    private static void show04() {

    }

    private static void show03() {
        File f1 = new File("C:\\users\\dofoa\\whfiha\\a.txt");
        System.out.println(f1.getName());
    }

    private static void show01() {
        File f1 = new File("C:\\users\\dofoa\\whfiha\\a.txt");
        System.out.println(f1.getAbsolutePath());
    }
}
