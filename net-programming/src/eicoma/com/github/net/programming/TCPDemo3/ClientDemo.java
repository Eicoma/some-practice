package eicoma.com.github.net.programming.TCPDemo3;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("169.254.184.191",12000);

        //获取缓冲字符流来获取键盘录入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //封装输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while((line = br.readLine()) != null){
            if (line.equals("exit")){
                System.out.println("文件写入结束");
                break;
            }else{
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
        }
        //释放资源时，仅关闭Socket对象即可
        s.close();
    }
}
