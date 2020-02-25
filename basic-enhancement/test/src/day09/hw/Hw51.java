package day09.hw;

import java.io.*;
import java.util.Scanner;

/**
 * 1.项目根目录下建立文件： user.txt，文件中存放用户名和登录密码，格式：用户名，密码,如：aaa,123；
 * 2. user.txt文件中初始存放的用户信息有如下：
 * jack,123
 * rose,123
 * tom,123
 * 3.要求完成如下功能：
 * 程序运行时：控制台提示用户输入注册的用户名和密码；
 * 验证键盘录入的用户名跟user.txt中已注册的用户名是否重复：
 * 是：控制台提示：用户名已存在
 * 否：将键盘录入的用户名及密码写入user.txt文件，并在控制台提示：注册成功
 *
 * @author Gakki
 * @date 2018/10/22 - 16:28
 */
public class Hw51 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();

        BufferedReader br = new BufferedReader(new FileReader("user.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            if (line.split(",")[0].equals(username)) {
                System.out.println("用户名已存在");
                return;
            }
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("user.txt", true));
        bw.newLine();
        bw.write(username +","+ password);
        bw.close();
        System.out.println("注册成功");


    }
}
