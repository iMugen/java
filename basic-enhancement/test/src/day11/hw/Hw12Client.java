package day11.hw;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Gakki
 * @date 2018/10/20 - 23:25
 */
public class Hw12Client {
    /**
     * 1. 【客户端】输入流，从硬盘读取文件数据到程序中。
     * 2. 【客户端】输出流，写出文件数据到服务端。
     * 3. 【服务端】输入流，读取文件数据到服务端程序。
     * 4. 【服务端】输出流，写出文件数据到服务器硬盘中。
     * @param args
     */
    public static void main(String[] args) throws IOException {
        // 1.创建流对象
        // 1.1创建输出流，读取本地文件
        FileInputStream fis = new FileInputStream("G:\\VirtualBox-5.2.16-123759-Win.exe");
        // 1.2创建输出流，写到服务端
        Socket client = new Socket("localhost", 9090);
        OutputStream os = client.getOutputStream();

        // 2.写出数据
        byte[] b = new byte[1024];
        int len;
        while ((len = fis.read(b)) != -1) {
            os.write(b,0,len);
        }

        // 3.释放资源
        os.close();
        client.close();
        fis.close();
        System.out.println("文件上传完成");
    }
}

