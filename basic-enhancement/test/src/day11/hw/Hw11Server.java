package day11.hw;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Gakki
 * @date 2018/10/20 - 20:15
 */
public class Hw11Server {
    public static void main(String[] args) throws IOException {
//        需求说明：使用TCP编写一个网络程序,
//            设置服务器程序监听端口为8002,
//            当于客户端建立后,向客户端发送”hello world”,
//            客户端将信息输出

        // 创建一个服务器，指定8002端口
        ServerSocket server = new ServerSocket(8002);
        // 创建客户端的连接
        Socket accept = server.accept();
        // 获取输出流对象，用于向客户端发送数据
        OutputStream os = accept.getOutputStream();
        //write里面需要传数组，所以用getBytes方法将string字符串转为数组
        os.write("Gakki Smile".getBytes());
        os.close();
        accept.close();
    }
}
