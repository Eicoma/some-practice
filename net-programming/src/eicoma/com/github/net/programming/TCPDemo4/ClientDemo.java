package eicoma.com.github.net.programming.TCPDemo4;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("169.254.184.191", 12000);
        //创建缓冲字符输入流，从本模块的file.txt中读取数据
        BufferedReader br = new BufferedReader(new FileReader("net-programming\\file.txt"));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //释放资源，因为BufferedReader对象不受Socket对象控制，所以也需要关闭
        br.close();
        s.close();
    }
}
