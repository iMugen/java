package day09.hw;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Gakki
 * @date 2018/10/17 - 11:48
 */
public class Hw01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("d:\\a.txt");
        fos.write(97);
    }
}
