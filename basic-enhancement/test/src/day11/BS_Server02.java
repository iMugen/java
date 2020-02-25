package day11;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 模拟BS结构的服务器
 * @author Gakki
 * @date 2018/10/22 - 14:30
 */
public class BS_Server02 {
    public static void main(String[] args) throws IOException {
        // 创建一个服务器对象，绑定一个端口
        ServerSocket server = new ServerSocket(9091);
        // 监听客户端请求
        Socket socket = server.accept();
        // 获取输入流读取用户请求数据
        // 读取字节的InputStream is = accept.getInputStream();
        // 转换流，转成读取字符的InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        // GET /web/index.html HTTP/1.1是浏览器的请求消息。
        // /web/index.html为浏览器想要请求的服务器端的资源,使用字符串切割方式获取到请求的资源。
        String line = br.readLine();
        System.out.println(line);

        // 获取输出流 往客户端返回数据
        OutputStream os = socket.getOutputStream();
        // 写入HTTP协议响应头,固定写法
        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        os.write("Content‐Type:text/html\r\n".getBytes());
        // 必须要写入空行,否则浏览器不解析(写回字节数组）
        os.write(System.lineSeparator().getBytes());
        os.write("\r\n".getBytes());

        // 下面才是实际要显示的数据
        os.write("<font color='pink' size=50>Gakki</font>".getBytes());
        os.close();
        br.close();
        socket.close();
    }
}
