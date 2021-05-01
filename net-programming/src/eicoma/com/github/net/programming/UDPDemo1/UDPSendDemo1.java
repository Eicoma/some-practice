package eicoma.com.github.net.programming.UDPDemo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSendDemo1 {
    public static void main(String[] args) throws IOException {
        //创建发送端的Socket对象
        DatagramSocket ds = new DatagramSocket();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        //static InetAddress getByName(String host) 返回该InetAddress类的对象（String host可以为主机名也可以为IP地址）
        //String getHostName() 通过InetAddress对象调用该方法，返回主机名
        //String getHostAddress() 通过InetAddress对象调用该方法，返回IP地址字符串
//        System.out.println(InetAddress.getByName("DESKTOP-8SR48GT").getHostName() + "\n"+ InetAddress.getByName("DESKTOP-8SR48GT").getHostAddress());
        while ((s = br.readLine())!= null){
            //当输入退出时，发送数据结束
            if(s.equals("退出")){
                break;
            }
            //创建数据，并把数据打包
            //把从键盘录入的字符串转化为字节数组
            byte[] byteArray = s.getBytes();
            DatagramPacket dp = new DatagramPacket(byteArray,byteArray.length, InetAddress.getByName("DESKTOP-8SR48GT"),10086);
            //通过DatagramSocket对象发送数据
            ds.send(dp);
        }
        ds.close();
    }
}
