package day10.hw;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author Gakki
 * @date 2018/10/19 - 23:09
 */
public class Hw13 {
    public static void main(String[] args) throws FileNotFoundException {
//        描述:从键盘录入一行字符串，
//        利用字节打印流将该行字符串保存到当前项目根目录下的d.txt文件中
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String s = sc.next();
        System.out.println(s);

        System.setOut(new PrintStream("d.txt"));
        System.out.println(s);
    }
}
