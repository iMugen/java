package day10.hw;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Gakki
 * @date 2018/10/19 - 21:15
 */
public class Hw02 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:e.txt"));
        bos.write("i love Gakki".getBytes());
        bos.close();
    }
}
