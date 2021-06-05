package eicoma.com.github.mapper;

import eicoma.com.github.bean.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {
    //查询全部
    @Select("SELECT * FROM user")
    public abstract List<User> selectAll();

    //新增操作
    @Insert("INSERT INTO user VALUES(#{id},#{name},#{age})")
    public abstract Integer insert(User user);

    //修改操作
    @Update("UPDATE user SET name=#{name},age=#{age} WHERE id=#{id}")
    public abstract Integer update(User user);

    //删除操作
    @Delete("DELETE FROM user WHERE id=#{id}")
    public abstract Integer delete(Integer id);
}
