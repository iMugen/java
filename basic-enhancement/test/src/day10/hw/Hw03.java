package day10.hw;

import java.io.*;

/**
 * @author Gakki
 * @date 2018/10/18 - 9:40
 */
public class Hw03 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("G:\\图库\\Gakii\\001.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\001.jpg"));
        byte[] b = new byte[1024];
        int y;
        while ((y = bis.read(b)) != -1) {
            bos.write(b);
        }
        bis.close();
        bos.close();
    }
}
