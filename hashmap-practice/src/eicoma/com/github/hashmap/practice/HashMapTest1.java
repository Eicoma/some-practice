package eicoma.com.github.hashmap.practice;

import java.util.HashMap;

public class HashMapTest1 {
    public static void main(String[] args) {
        HashMap<Student,String> hashMap = new HashMap<>();

        Student stu1 = new Student("qiumin",35);
        Student stu2 = new Student("huangjing",36);
        Student stu3 = new Student("tanqun",37);
        Student stu4 = new Student("zuozhongzhi",38);
        //此处创建了一个属性和stu4相同的对象sut5
        Student stu5 = new Student("zuozhongzhi",38);

        hashMap.put(stu1,"西安");
        hashMap.put(stu2,"重庆");
        hashMap.put(stu3,"北京");
        hashMap.put(stu4,"上海");
        //此处将属性值和stu4相同的stu5添加进hashMap集合中
        //会导致键stu4的值被stu5的值所覆盖
        hashMap.put(stu5,"福建");

        for(Student key : hashMap.keySet()){
            String value = hashMap.get(key);
            System.out.println("姓名：" + key.getName() + "年龄：" + key.getAge() + "住址：" + value);
        }

    }
}
