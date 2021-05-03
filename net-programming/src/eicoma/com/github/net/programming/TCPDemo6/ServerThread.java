package eicoma.com.github.net.programming.TCPDemo6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread implements Runnable{
    private Socket s;

    public ServerThread(Socket s){
        this.s = s;
    }
    @Override
    public void run() {
        try{
            //读取客户端写入的流中的数据
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            //将从流中读取的数据写入到文件中
            int count = 0;
            File file = new File("net-programming\\ClientDemoCopy["+count+"].java");
            while (file.exists()){
                count++;
                file = new File("net-programming\\ClientDemoCopy["+count+"].java");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            String line;
            while((line = br.readLine()) != null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            //反馈
            BufferedWriter bws = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bws.write("服务器端已接收到数据！");
            bws.newLine();
            bws.flush();

            //释放资源
            s.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
