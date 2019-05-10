package wang.l1n.dormitory.entity;

/**
 * @author ：L1nker4
 * @date ： 创建于  2019/4/21 16:19
 * @description：  id：学号     name：姓名     classname：班级名       dormitory：宿舍名
 */
public class Student {
    private Integer id;
    private String name;
    private String classname;
    private String dormitory;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getDormitory() {
        return dormitory;
    }

    public void setDormitory(String dormitory) {
        this.dormitory = dormitory;
    }
}
