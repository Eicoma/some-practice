package eicoma.com.github.file.practice;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * 案例需求
 *
 * 统计一个文件夹中每种文件的个数并打印
 *
 * + 实现步骤
 *
 *   + 定义一个方法,参数是HashMap集合用来统计次数和File对象要统计的文件夹
 *   + 遍历File对象,获取它下边的每一个文件和文件夹对象
 *   + 判断当前File对象是文件还是文件夹
 *   + 如果是文件,判断这种类型文件后缀名在HashMap集合中是否出现过
 *     + 没出现过,将这种类型文件的后缀名存入集合中,次数存1
 *     + 出现过,获取这种类型文件的后缀名出现的次数,对其+1,在存回集合中
 *   + 如果是文件夹,递归调用自己,HashMap集合就是参数集合,File对象是当前文件夹对象
 */

public class FileDemo3 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        File files = new File("file-practice");
        getCounts(map,files);
        System.out.println(map);
    }

    private static void getCounts(Map<String, Integer> map, File files) {
        File[] fileArray = files.listFiles();
        for (File file : fileArray){
            if(file.isFile()){
                String fileName = file.getName();
                System.out.println(fileName);
                //此处split()的参数为"\\."
                String[] nameArray = fileName.split("\\.");
                String endName = nameArray[1];
                Integer count = map.get(endName);
                if(map.get(endName) != null){
                    count++;
                    map.put(endName,count);
                }else{
                    map.put(endName,1);
                }
            }else{
                getCounts(map,file);
            }
        }
    }
}
