package eicoma.com.github.mapper;

import eicoma.com.github.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    //查询全部
    @Select("SELECT * FROM user")
    public abstract List<User> selectAll();

    //新增操作
    @Insert("INSERT INTO user VALUES(#{id},#{name},#{age})")
    public abstract Integer insert(User user);
}
