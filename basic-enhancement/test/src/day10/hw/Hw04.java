package day10.hw;

import java.io.*;
import java.util.Scanner;

/**
 * @author Gakki
 * @date 2018/10/19 - 22:00
 */
public class Hw04 {
    public static void main(String[] args) throws IOException {
//        实现一个验证码小程序，要求如下：
//        1. 在项目根目录下新建一个文件：data.txt,键盘录入3个字符串验证码，并存入data.txt中，要求一个验证码占一行；
//        2. 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：在控制台提示验证成功，如果不存在控制台提示验证失败

        BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入验证码：");
            String s = sc.next();
            bw.write(s);
            bw.newLine();
        }
        bw.close();

        System.out.println("输入校验码：");
        String s2 = sc.next();
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String line = br.readLine();
        if (line == s2) {
            System.out.println("验证成功");
        } else {
            System.out.println("验证失败");
        }
        br.close();
    }
}
