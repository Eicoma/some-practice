package eicoma.com.github.test;

import eicoma.com.github.bean.User;
import eicoma.com.github.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test01 {
    @Test
    public void selectAll() throws IOException {
        //1.加载核心配置文件
        InputStream is = Resources.getResourceAsStream("MyBatisConfig.xml");
        //2.获取SqlSession工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //3.获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //4.获取UserMapper接口的实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //5.调用实现类对象中的方法，接收结果
        List<User> users = mapper.selectAll();
        //6.处理结果
        for (User user : users){
            System.out.println(user);
        }
        //7.释放资源
        sqlSession.close();
        is.close();
    }

    @Test
    public void insert() throws IOException {
        //1.加载核心配置文件
        InputStream is = Resources.getResourceAsStream("MyBatisConfig.xml");
        //2.获取SqlSession工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //3.获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //4.获取UserMapper接口的实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //5.调用实现类对象中的方法，接收结果
        User user = new User(5, "周七", 22);
        Integer result = mapper.insert(user);
        //6.处理结果
        System.out.println(result);
        //7.释放资源
        sqlSession.close();
        is.close();
    }
}
