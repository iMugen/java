package day10;

import java.io.*;

/**
 * @author Gakki
 * @date 2018/10/18 - 14:53
 */
public class Demo03 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\测试.txt"),"utf-8");
        osw.write("我老婆是新垣结衣");
        osw.close();
    }

    public static void test1() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\gbk文件.txt"),"gbk");
        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.print((char)ch);
        }
        isr.close();
    }
}
