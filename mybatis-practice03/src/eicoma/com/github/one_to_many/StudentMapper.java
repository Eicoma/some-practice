package eicoma.com.github.one_to_many;

import eicoma.com.github.bean.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    //根据cid查询student表
    @Select("SELECT * FROM student WHERE cid=#{cid}")
    public abstract List<Student> selectById(Integer cid);
}
