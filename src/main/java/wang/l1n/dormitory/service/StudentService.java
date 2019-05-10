package wang.l1n.dormitory.service;

import wang.l1n.dormitory.dto.BaseResult;
import wang.l1n.dormitory.entity.Student;

import java.util.List;

public interface StudentService {
    /**
     * 获取所有学生数据
     * @return
     */
    List<Student> getAllStudent();

    /**
     * 添加学生数据
     * @param student
     * @return
     */
    BaseResult addStudent(Student student);

    BaseResult deleteStudent(Integer id);

    BaseResult deleteStudentByMutilId(String[] ids);
}
