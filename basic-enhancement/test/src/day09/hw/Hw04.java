package day09.hw;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Gakki
 * @date 2018/10/17 - 11:48
 */
public class Hw04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("d:\\a.txt");
        int by;
        while ((by = fis.read()) != -1) {
            System.out.print((char) by);
        }
        fis.close();

    }
}
