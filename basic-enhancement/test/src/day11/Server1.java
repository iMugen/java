package day11;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Gakki
 * @date 2018/10/20 - 11:08
 */
public class Server1 {
    public static void main(String[] args) throws IOException {
        while (true) {
            //创建一个绑定指定端口的服务器
            ServerSocket server = new ServerSocket(6666);
            //监听客户端的连接
            Socket accept = server.accept();
            //获取输入流对象用于读取客户端发送过来的数据
            InputStream is = accept.getInputStream();
            byte[] b = new byte[1024];
            int len;
            String str = null;
            while ((len = is.read(b)) != -1) {
                str = new String(b, 0, len).toUpperCase();
            }

            // str中存储的就是字母转大写后的数据
            if (str != null) {
                //返回大写字母
                OutputStream os = accept.getOutputStream();
                os.write(str.getBytes());
                os.close();
            }

            //释放资源
            is.close();
            accept.close();
            server.close();
            System.out.println("=======");
        }
    }
}
