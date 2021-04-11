package eicoma.com.github.treeSet.practice;

//这里通过自定义类（标准类）实现Comparable接口，重写其compareTo()方法并根据返回值来进行自然排序
public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        //按照对象的年龄进行排序
        int result = this.age - o.age;
        //当两个对象年龄相同时，通过名字的字符串大小进行排序
        //String.compareTo()方法 通过将字符串转化为int值进行相减运算
        result = result == 0 ? this.name.compareTo(o.name) : result;
        return result;
    }
}
