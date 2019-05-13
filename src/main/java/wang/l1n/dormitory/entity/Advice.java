package wang.l1n.dormitory.entity;

import java.util.Date;

/**
 * @author ：L1nker4
 * @date ： 创建于  2019/4/28 21:35
 * @description：
 */
    public class Advice {
        private int aid;
        private String title;
        private String context;
        private Integer sid;
        private Student student;
        private Date createTime;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Advice{" +
                "aid='" + aid + '\'' +
                ", title='" + title + '\'' +
                ", context='" + context + '\'' +
                ", sid=" + sid +
                ", student=" + student +
                ", createTime=" + createTime +
                '}';
    }
}
