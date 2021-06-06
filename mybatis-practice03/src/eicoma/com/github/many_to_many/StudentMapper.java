package eicoma.com.github.many_to_many;

import eicoma.com.github.bean.Student_02;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    //查询全部
    @Select("SELECT DISTINCT s.id,s.name,s.age FROM student s,stu_cr sc WHERE sc.sid=s.id ")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "age",property = "age"),
            @Result(
                    property = "courses",
                    javaType = List.class,
                    column = "id",  //根据查询出的student表的id来作为关联条件，去查询中间表和课程表

                    /*
                        many,@Many 一对多查询的固定写法
                        select属性：指定调用哪个接口中的哪个查询方法
                     */
                    many = @Many(select = "eicoma.com.github.many_to_many.CourseMapper.selectBySid")
            )
    })
    public abstract List<Student_02> selectAll();
}
