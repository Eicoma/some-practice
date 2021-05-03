package eicoma.com.github.net.programming.TCPDemo1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo1 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("169.254.184.191",12000);

        OutputStream os = s.getOutputStream();

        os.write("客户端发送请求".getBytes());

        InputStream is = s.getInputStream();
        byte[] byteArray = new byte[1024];
        //len为读取的字节的数目
        int len = is.read(byteArray);
//        System.out.println(len);
        String data = new String(byteArray,0,len);
        System.out.println("客户端接收到数据：" + data);

//        InputStream is = s.getInputStream();
//        byte[] byteArray = new byte[1024];
//        int len;
//        while((len = is.read(byteArray)) != -1){
//            System.out.println("客户端接收到数据：" + new String(byteArray,0,len));
//        }
        s.close();
    }
}
