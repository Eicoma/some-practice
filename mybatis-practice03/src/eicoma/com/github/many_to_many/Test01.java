package eicoma.com.github.many_to_many;

import eicoma.com.github.bean.Classes;
import eicoma.com.github.bean.Course;
import eicoma.com.github.bean.Student;
import eicoma.com.github.bean.Student_02;
import eicoma.com.github.one_to_many.ClassesMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class Test01 {
    @Test
    public void selectAll() throws Exception{
        InputStream is = Resources.getResourceAsStream("MybatisConfig.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student_02> students = mapper.selectAll();

        for (Student_02 stu : students){
            System.out.println(stu.getId() + "," + stu.getName() + "," + stu.getAge());
            List<Course> courses = stu.getCourses();
            for (Course course : courses){
                System.out.println("\t" + course);
            }
        }
        sqlSession.close();
        is.close();

    }
}
