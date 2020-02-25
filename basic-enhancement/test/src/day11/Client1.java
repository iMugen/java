package day11;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author Gakki
 * @date 2018/10/20 - 10:50
 */
public class Client1 {
    public static void main(String[] args) throws IOException {
        // 创建客户端对象和指定的ip和端口的服务器进行连接
        Socket client = new Socket("127.0.0.1", 6666);
        //获取输出流对象
        OutputStream os = client.getOutputStream();
        //发送数据
        os.write("gakkismile".getBytes());

        //停止发生数据
        client.shutdownOutput();

        //接收服务器返回的内容
        InputStream is = client.getInputStream();
        byte[] b = new byte[1024];
        int len;
        while ((len = is.read(b)) != -1) {
            System.out.println(new String(b, 0, len));
        }

        //释放资源
        is.close();
        os.close();
        client.close();
    }
}
