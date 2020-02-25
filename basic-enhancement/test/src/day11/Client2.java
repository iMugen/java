package day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author Gakki
 * @date 2018/10/20 - 14:38
 */
public class Client2 {
    /**
    向服务器上传图片
     */
    public static void main(String[] args) throws IOException {
        // 创建客户端
        Socket client = new Socket("192.168.2.102", 8888);
        // 创建输入流对象关联客户端硬盘上要上传的图片
        FileInputStream fis = new FileInputStream("F:\\BaiduNetdiskDownload\\（PC）WPS_去广告本地纯净版.exe");
        // 获取输出流 往服务器发送数据
        OutputStream os = client.getOutputStream();

        int len;
        byte[] b = new byte[1024*8];
        while ((len = fis.read(b)) != -1) {
            os.write(b,0,len);
        }

        // 释放资源
        fis.close();
        os.close();
        client.close();
    }
}
