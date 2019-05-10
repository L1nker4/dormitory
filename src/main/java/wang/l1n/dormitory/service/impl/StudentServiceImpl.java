package wang.l1n.dormitory.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wang.l1n.dormitory.dto.BaseResult;
import wang.l1n.dormitory.entity.Student;
import wang.l1n.dormitory.mapper.StudentMapper;
import wang.l1n.dormitory.service.StudentService;

import java.util.List;

/**
 * @author ：L1nker4
 * @date ： 创建于  2019/4/24 20:35
 * @description：
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    /**
     * 获取所有学生信息
     * @return
     */
    @Override
    public List<Student> getAllStudent() {
        return studentMapper.selectAll();
    }

    @Override
    public BaseResult addStudent(Student student) {
        BaseResult baseResult = new BaseResult();
        studentMapper.addStudent(student);
        baseResult.setMessage("添加学生成功");
        return baseResult;
    }

    @Override
    public BaseResult deleteStudent(Integer id) {
        BaseResult baseResult = new BaseResult();
        studentMapper.deleteStudentById(id);
        baseResult.setMessage("删除学生成功");
        return baseResult;
    }

    @Override
    public BaseResult deleteStudentByMutilId(String[] ids) {
        BaseResult baseResult = new BaseResult();
        studentMapper.deleteStudentByMutilId(ids);
        baseResult.setMessage("删除学生成功");
        return baseResult;
    }

}
