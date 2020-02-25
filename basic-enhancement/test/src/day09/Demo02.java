package day09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Gakki
 * @date 2018/10/17 - 15:28
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("d:\\a.txt");

        byte[] bys = new byte[3];
        int len;
        while ((len = fis.read(bys)) != -1) {
            System.out.println(new String(bys,0,len));
        }

        fis.close();

    }
}
