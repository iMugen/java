package day11.hw;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author Gakki
 * @date 2018/10/20 - 20:26
 */
public class Hw11Client {
    public static void main(String[] args) throws IOException {
//        需求说明：使用TCP编写一个网络程序,
//                设置服务器程序监听端口为8002,
//                当于客户端建立后,向客户端发送”hello world”,
//                客户端将信息输出
        Socket client = new Socket("127.0.0.1", 8002);
        InputStream is = client.getInputStream();
        byte[] b = new byte[1024];
        int len;
        while ((len = is.read(b)) != -1) {
            System.out.println(new String(b));
        }
        is.close();
        client.close();
    }
}
