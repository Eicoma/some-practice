package eicoma.com.github.io.practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest1 {
    public static void main(String[] args) throws IOException {
        User user1 = new User("tangsan","123456");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("io-practice\\user1.txt"));

        oos.writeObject(user1);
        oos.close();
    }

}
