package eicoma.com.github.net.programming.TCPDemo6;
/**
 * 为每一个客户端开启线程
 */

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(12000);

        while (true) {
            Socket s = ss.accept();
            new Thread(new ServerThread(s)).start();
        }
    }
}
