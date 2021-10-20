package eicoma.com.github.one_to_many;


import eicoma.com.github.bean.Classes;
import eicoma.com.github.bean.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class Test01 {
    @Test
    public void selectAll() throws Exception {
        InputStream is = Resources.getResourceAsStream("MybatisConfig.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        ClassesMapper mapper = sqlSession.getMapper(ClassesMapper.class);

        List<Classes> classes = mapper.selectAll();

        for (Classes cla : classes) {
            System.out.println(cla.getId() + "," + cla.getName());
            List<Student> students = cla.getStudents();
            for (Student stu : students) {
                System.out.println("\t" + stu);
            }
        }
//        for (Classes cla : classes){
//            System.out.println(cla);
//        }

        sqlSession.close();
        is.close();
    }
}
