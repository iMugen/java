package day11.hw;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Gakki
 * @date 2018/10/21 - 8:32
 */
public class Hw12Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器启动...");
        // 1.创建服务端ServerSocket
        ServerSocket server = new ServerSocket(9090);
        while (true) {
            // 2.建立连接（监听）
            Socket accept = server.accept();
            new Thread(() -> {
                    try {
                        // 3.创建流对象
                        // 3.1创建输入流对象，读取文件数据
                        InputStream is = accept.getInputStream();
                        // 3.2创建输出流，保存到本地
                        FileOutputStream fos = new FileOutputStream("d:\\"+System.currentTimeMillis()+".exe");

                        // 4.读写数据
                        byte[] b = new byte[1024];
                        int len;
                        while ((len = is.read(b)) != -1) {
                            fos.write(b,0,len);
                        }

                        // 5.释放资源
                        fos.close();
                        is.close();
                        accept.close();
                        System.out.println("上传图片成功");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            ).start();
        }

    }
}
