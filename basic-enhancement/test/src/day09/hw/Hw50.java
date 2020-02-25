package day09.hw;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 第1次控制台输出：欢迎使用本软件，第1次使用免费
 * 第2次控制台输出：欢迎使用本软件，第2次使用免费
 * 第3次控制台输出：欢迎使用本软件，第3次使用免费
 * 第4次控制台输出：本软件只能免费使用3次，欢迎注册会员后使用
 * @author Gakki
 * @date 2018/10/22 - 15:14
 */
public class Hw50 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("times.txt");
        int times = fr.read()-48;
        fr.close();
        if (times < 3) {
            System.out.println("欢迎使用本软件，第"+(++times)+"次使用免费");
            FileWriter fw = new FileWriter("times.txt");
            fw.write(times+"");
            fw.close();
        } else {
            System.out.println("本软件只能免费使用3次，欢迎注册会员后使用");
        }

    }
}
