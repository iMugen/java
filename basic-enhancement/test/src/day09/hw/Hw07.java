package day09.hw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 项目需求：请用户从控制台输入信息，程序将信息存储到文件Info.txt中。
 * 可以输入多条信息，每条信息存储一行。当用户输入：”886”时，程序结束。
 *
 * @author Gakki
 * @date 2018/10/22 - 18:18
 */
public class Hw07 {
    public static void main(String[] args) throws IOException {
        // 创建输出流，指定文件位置
        FileWriter fw = new FileWriter("Info.txt");
        // 采用循环模式，写数据
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入信息：");
            String s = sc.next();
            fw.write(s);
            fw.write(System.lineSeparator());
            if ("886".equals(s)) {
                break;
            }
        }
        fw.close();
    }
}
