package day09.hw;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Gakki
 * @date 2018/10/17 - 11:48
 */
public class Hw02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("d:\\b.txt");
        fos.write("i love Gakki".getBytes());
    }
}
