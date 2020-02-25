package day10.hw;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author Gakki
 * @date 2018/10/19 - 22:21
 */
public class Hw05 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter( new FileOutputStream("a.txt"),"gbk");
        osw.write("我爱Gakki");
        osw.close();
    }
}
