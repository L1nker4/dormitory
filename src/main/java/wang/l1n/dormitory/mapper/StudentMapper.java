package wang.l1n.dormitory.mapper;

import org.apache.ibatis.annotations.Mapper;
import wang.l1n.dormitory.entity.Student;

import java.util.List;

@Mapper
public interface StudentMapper {
    /**
     * 获取所有学生信息
     * @return
     */
    List<Student> selectAll();

    /**
     * 添加学生信息
     * @param student
     */
    void addStudent(Student student);

    /**
     * 根据学号删除学生
     * @param id
     */
    void deleteStudentById(Integer id);

    /**
     * 批量删除学生
     * @param
     */
    void deleteStudentByMutilId(String[] ids);
}
