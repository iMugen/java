package day11;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Gakki
 * @date 2018/10/20 - 16:06
 */
public class BS_Server {
    /**
     * 模拟BS结构中的服务器
     * @param args
     */
    public static void main(String[] args) throws IOException {
        // 创建服务器对象，绑定一个端口
        ServerSocket ss = new ServerSocket(8899);
        while (true) {
            // 监听客户端请求
            Socket accept = ss.accept();
            new Thread(() -> {
                try {
                    // 用输入流获取用户请求的数据
                    BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream(),"gbk"));
                    // GET /test/web/index.html HTTP/1.1 浏览器发送的暗号
                    String line = br.readLine();
                    line = line.split(" ")[1].substring(1);
                    System.out.println(line);

                    // 往客户端返回数据
                    OutputStream os = accept.getOutputStream();
                    // 返回暗号固定写法
                    os.write("HTTP/1.1 200 OK\r\n".getBytes());
                    os.write("Content-Type:text/html\r\n".getBytes());
                    os.write(System.lineSeparator().getBytes());

                    // 以下才是实际要发给浏览器的数据
                    // 下一个html的数据给浏览器
                    FileInputStream fis = new FileInputStream(line);
                    int len;
                    byte[] b = new byte[1024 * 8];
                    while ((len = fis.read(b)) != -1) {
                        os.write(b,0,len);
                    }

                    os.close();
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }

    }
}
