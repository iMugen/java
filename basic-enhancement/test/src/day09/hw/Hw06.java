package day09.hw;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Gakki
 * @date 2018/10/17 - 15:59
 */
public class Hw06 {
    public static void main(String[] args) throws IOException {
        // 用字节输入流关联数据源
        FileInputStream fis = new FileInputStream("G:\\静态-非静态总结.wmv");
        // 用字节输出流关联目的地
        FileOutputStream fos = new FileOutputStream("d:\\静态-非静态总结.wmv");

        byte[] bys = new byte[1024*8];
        // 从数据源读取到程序中，写数据到目的，边读边写
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys,0,len);
        }
        fis.close();
        fos.close();

    }
}
