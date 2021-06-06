package eicoma.com.github.many_to_many;

import eicoma.com.github.bean.Course;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CourseMapper {
    //根据学生id查询所选的课程，并将其返回给StudentMapper
    @Select("SELECT c.id,c.name FROM stu_cr sc,course c WHERE sc.cid=c.id AND sc.sid=#{id} ")
    public abstract List<Course> selectBySid(Integer sid);
}
