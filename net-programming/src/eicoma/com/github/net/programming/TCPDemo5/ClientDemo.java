package eicoma.com.github.net.programming.TCPDemo5;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("169.254.184.191", 12000);
        //创建缓冲字符输入流，从本模块的file.txt中读取数据
        BufferedReader br = new BufferedReader(new FileReader("net-programming\\ClientDemo.java"));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //调用结束标签
        //如果不调用此方法，会导致服务器端一直在等待接受数据，无法执行到将反馈数据输入到流中的那一步操作
        s.shutdownOutput();

        BufferedReader brc = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String fankui = null;
        fankui = brc.readLine();
        System.out.println("服务器反馈：" + fankui);
        //释放资源，因为BufferedReader对象不受Socket对象控制，所以也需要关闭
        br.close();
        s.close();
    }
}
