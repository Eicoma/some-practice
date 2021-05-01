package eicoma.com.github.net.programming.TCPDemo1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo1 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(12000);

        Socket s = ss.accept();

        InputStream is = s.getInputStream();

        byte[] byteArray = new byte[1024];
        int len = is.read(byteArray);
        String data = new String(byteArray,0,len);
        System.out.println("服务器端接收到：" + data);

        OutputStream os = s.getOutputStream();
        os.write("服务器已接收到请求".getBytes());

        ss.close();
    }
}
