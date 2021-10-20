package eicoma.com.github.file.practice;

import java.io.File;
import java.io.IOException;

/**
 * 案例需求
 * <p>
 * 在当前模块下的aaa文件夹中创建一个a.txt文件
 * <p>
 * 实现步骤
 * <p>
 * + 创建File对象,指向aaa文件夹
 * + 判断aaa文件夹是否存在,如果不存在则创建
 * + 创建File对象,指向aaa文件夹下的a.txt文件
 * + 创建这个文件
 */

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        File file = new File("file-practice\\aaa");
        if (!file.exists()) {
            file.mkdirs();
        }

        File newFile = new File(file, "a.txt");
        newFile.createNewFile();
    }
}
