package day09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Gakki
 * @date 2018/10/17 - 10:45
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("d:\\b.txt",true);
        fos.write("别人笑我太疯癫\r\n".getBytes());
        fos.write("别人笑我太疯癫".getBytes());
        fos.write(System.lineSeparator().getBytes());
        fos.write("别人笑我太疯癫\r\n".getBytes());
        fos.write("别人笑我太疯癫\r\n".getBytes());

        fos.close();

    }

    public static void test1() throws IOException {
//        fos.write(97);
//        fos.write(98);
//        fos.write(99);
        FileOutputStream fos = new FileOutputStream("d:\\b.tex");
        String s = "i love Gakki";
        fos.write(s.getBytes());
    }
}
