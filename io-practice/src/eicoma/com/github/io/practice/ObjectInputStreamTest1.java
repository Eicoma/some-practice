package eicoma.com.github.io.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("io-practice\\user1.txt"));
        //此处ois读取出来的数据是Object类型的，需要强转为User类型
        User user1 = (User) ois.readObject();

        //System.out.println(user1.toString());
        System.out.println(user1);

        ois.close();
    }
}
