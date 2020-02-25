package day10.hw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Gakki
 * @date 2018/10/19 - 22:35
 */
public class Hw06 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"), "gbk");
        int len;
        while ((len = isr.read()) != -1) {
            System.out.print((char) len);
        }
        isr.close();
    }
}
