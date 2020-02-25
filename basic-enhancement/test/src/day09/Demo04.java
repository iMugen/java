package day09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Gakki
 * @date 2018/10/17 - 16:33
 */
public class Demo04 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("test\\a.txt");

        int ch;

        while ((ch = fr.read()) != -1) {
            System.out.println((char)ch);
        }

        fr.close();
    }
}
