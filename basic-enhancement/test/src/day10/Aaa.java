package day10;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Gakki
 * @date 2018/10/18 - 18:46
 */
public class Aaa {
    public static void main(String[] args) throws IOException {
        BufferedInputStream buf = new BufferedInputStream(new FileInputStream("123.txt"));//itcast表示模块名
        int b1 = buf.read();System.out.println(b1);
        int b2 = buf.read();System.out.println(b2);
        int b3 = buf.read();System.out.println(b3);
        buf.close();
    }
}
