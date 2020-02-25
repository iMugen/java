package day11.hw;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Gakki
 * @date 2018/10/20 - 19:47
 */
public class Hw05 {
    public static void main(String[] args) throws IOException {
//        需求说明：创建新项目，按以下要求编写代码：
//        在项目下创建TCP 服务器端 端口号为8888
//        1:等待客户端连接   如果有客户端连接  获取到客户端对象
//        2:获取到客户端对象之后 当前在服务器读取数据客户端传送数据

        // 创建一个绑定指定端口的服务器
        ServerSocket server = new ServerSocket(8888);
        // 监听客户端的连接
        Socket accept = server.accept();

        // 获取输入流对象用于读取客户端发过来的数据
        InputStream is = accept.getInputStream();
        int len;
        byte[] b = new byte[1024];
        while ((len = is.read(b)) != -1) {
            // 把接收到的数组转化为string
            System.out.println(new String(b));
        }
        is.close();
        accept.close();

    }
}
