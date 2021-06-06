package eicoma.com.github.many_to_many;

import eicoma.com.github.bean.Student_02;

import java.util.List;

public interface StudentMapper {
    //查询全部
    public abstract List<Student_02> selectAll();
}
