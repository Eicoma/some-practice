package eicoma.com.github.net.programming.TCPDemo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(12000);

        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        //释放资源时仅关闭ServerSocket对象即可
        ss.close();
    }
}
