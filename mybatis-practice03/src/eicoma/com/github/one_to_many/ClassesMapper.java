package eicoma.com.github.one_to_many;

import eicoma.com.github.bean.Classes;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ClassesMapper {
    //查询全部
    @Select("SELECT * FROM classes")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(
                    property = "students",
                    javaType = List.class,
                    column = "id",
                    /*
                        many,@Many 是一对多查询的固定写法
                        select属性：指定调用该接口中的某个方法
                        （该方法会接收到在此处传过去的id的属性值）
                     */
                    many = @Many(select = "eicoma.com.github.one_to_many.StudentMapper.selectById")
            )
    })
    public abstract List<Classes> selectAll();
}
