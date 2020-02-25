package day11.hw;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author Gakki
 * @date 2018/10/20 - 20:02
 */
public class Hw06 {
    public static void main(String[] args) throws IOException {
//        需求说明：创建新项目，按以下要求编写代码：
//        在项目下创建TCP 客户端
//        访问之前创建的服务器端,服务器端ip127.0.0.1 端口号8888
//        1:客户端连接服务器,并发送 hello.服务器,我是客户端.
//        2:开启上一题服务器,等待客户端连接,客户端连接并发送数据
        Socket client = new Socket("127.0.0.1", 8888);
        OutputStream os = client.getOutputStream();
        os.write("你好Gakii，我们结婚吧".getBytes());
        os.close();
    }
}
