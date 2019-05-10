package wang.l1n.dormitory.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import wang.l1n.dormitory.dto.BaseResult;
import wang.l1n.dormitory.entity.Student;
import wang.l1n.dormitory.service.StudentService;

import java.util.List;

/**
 * @author ：L1nker4
 * @date ： 创建于  2019/4/21 16:18
 * @description：
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    /**
     * 返回所有学生数据
     * @param model
     * @return
     */
    @RequestMapping("/info")
    public String toStudentList(Model model) {
        List<Student> student = studentService.getAllStudent();
        model.addAttribute("student", student);
        return "StudentInfo";
    }

    /**
     * 跳转到添加页面
     * @return
     */
    @RequestMapping("/add")
    public String toAddPage(){
        return "StudentAdd";
    }

    /**
     * 执行添加操作
     * @param student
     * @return
     */
    @RequestMapping(value = "/addStudent",method = RequestMethod.POST)
    public String addStudent(Student student, RedirectAttributes redirectAttributes){
        BaseResult baseResult = studentService.addStudent(student);
        System.out.println(baseResult.getMessage());
        redirectAttributes.addFlashAttribute("message", baseResult.getMessage());
        return "redirect:/student/info";
    }

    /**
     * 删除单个学生
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.POST)
    public BaseResult delete(@PathVariable("id") Integer id){
        BaseResult baseResult = null;
        if (id != null) {
            baseResult = studentService.deleteStudent(id);
        }
        return baseResult;
    }

    /**
     * 删除多个学生
     * @param ids
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deleteMutil",method = RequestMethod.POST)
    public BaseResult deleteMutil(String ids){
        BaseResult baseResult = null;
        if (StringUtils.isNotBlank(ids)){
            String [] id = ids.split(",");
            baseResult = studentService.deleteStudentByMutilId(id);
        } else {
            baseResult = BaseResult.fail("删除失败");
        }
        return baseResult;
    }


}
