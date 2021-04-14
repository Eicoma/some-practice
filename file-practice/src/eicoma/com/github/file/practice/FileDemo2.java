package eicoma.com.github.file.practice;

import java.io.File;

/**
 * 案例需求
 *
 * 删除一个多级文件夹
 *
 * 实现步骤
 *
 * + 定义一个方法,接收一个File对象
 * + 遍历这个File对象,获取它下边的每个文件和文件夹对象
 * + 判断当前遍历到的File对象是文件还是文件夹
 * + 如果是文件,直接删除
 * + 如果是文件夹,递归调用自己,将当前遍历到的File对象当做参数传递
 * + 参数传递过来的文件夹File对象已经处理完成,最后直接删除这个空文件夹
 */

public class FileDemo2 {
    public static void main(String[] args) {

        File fileOrigin = new File("C:\\Users\\32808\\Desktop\\src");
        deleteFiles(fileOrigin);
    }
    public static void deleteFiles(File fileOrigin){
        File[] fileArray= fileOrigin.listFiles();
        for (File file : fileArray){
            if (file.isFile()){
                file.delete();
            }else {
                //通过递归删除文件夹下的子文件夹以及子文件
                deleteFiles(file);
            }
        }
        //在上方的递归删除结束后，fileOrigin文件夹里的子文件和子文件夹必然全都被删除了
        //因此最后直接调用delete()方法将fileOrigin文件夹删除即可
        fileOrigin.delete();
    }
}
