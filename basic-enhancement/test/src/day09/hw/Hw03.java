package day09.hw;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Gakki
 * @date 2018/10/17 - 11:48
 */
public class Hw03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("d:\\c.txt", true);
        for (int i = 0; i < 5; i++) {
//            System.lineSeparator();
            fos.write("i love Gakki\r\n".getBytes());
        }
        // 释放资源
        fos.close();
    }
}
