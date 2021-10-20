package eicoma.com.github.treeSet.practice;

public class Student2 implements Comparable<Student2> {
    private String name;
    private int chinese;
    private int math;
    private int english;

    public Student2() {
    }

    public Student2(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                '}';
    }

    public int getSum() {
        return chinese + math + english;
    }

    @Override
    public int compareTo(Student2 o) {
        //TreeSet底层为红黑树的结构
        //this.为准备添加进TreeSet中的元素，o为已经添加进TreeSet中的元素
        //调换this.和o的顺序，即可使红黑树的结点添加顺序相反
        int result = this.getSum() - o.getSum();
        //若总成绩相同，则分别去比较math,chinese,english,若都相同则比较name
        result = result == 0 ? this.getMath() - o.math : result;
        result = result == 0 ? this.getChinese() - o.chinese : result;
        result = result == 0 ? this.getEnglish() - o.english : result;
        result = result == 0 ? this.getName().compareTo(o.name) : result;
        return result;
    }
}
