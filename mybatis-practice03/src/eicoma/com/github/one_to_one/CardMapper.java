package eicoma.com.github.one_to_one;

import eicoma.com.github.bean.Card;
import eicoma.com.github.bean.Person;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CardMapper {
    //查询全部
    @Select("SELECT * FROM card")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "number", property = "number"),
            @Result(
                    property = "p",  //被包含对象的变量名
                    javaType = Person.class,  //被包含对象的实际数据类型
                    column = "pid",  //根据查询出的card表中的pid字段来查询person表

                    /*
                        one, @One是一对一的固定写法
                        select属性：指定调用哪个接口中的哪个方法
                     */
                    one = @One(select = "eicoma.com.github.one_to_one.PersonMapper.selectById")
            )
    })
    public abstract List<Card> selectAll();
}
