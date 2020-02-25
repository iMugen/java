package day09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Gakki
 * @date 2018/10/17 - 15:59
 */
public class Demo03 {
    public static void main(String[] args) throws IOException {
        // 用字节输入流关联数据源
        FileInputStream fis = new FileInputStream("G:\\a.png");
        // 用字节输出流关联目的地
        FileOutputStream fos = new FileOutputStream("d:\\a.png");

        // 从数据源读取到程序中，写数据到目的，边读边写
        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fis.close();
        fos.close();

    }
}
