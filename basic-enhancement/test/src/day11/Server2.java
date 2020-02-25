package day11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Gakki
 * @date 2018/10/20 - 14:48
 */
public class Server2 {
    /**
     * 接收客户端传过来的图片，保存到本地硬盘
     */
    public static void main(String[] args) throws IOException {
        // 创建服务器端
        ServerSocket server = new ServerSocket(8888);
        while (true) {
            // 监听客户端连接
            Socket accept = server.accept();
            new Thread(() -> {
                try {
                    // 接收客户端传过来的数据
                    InputStream is = accept.getInputStream();
                    // 创建输出流对象关联服务器本地
                    FileOutputStream fos = new FileOutputStream("d:\\"+System.currentTimeMillis()+".jpg");

                    int len;
                    byte[] b = new byte[1024];
                    while ((len = is.read(b)) != -1) {
                        fos.write(b,0,len);
                    }

                    // 释放资源
                    is.close();
                    fos.close();
                    accept.close();
                    System.out.println("上传图片成功");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
