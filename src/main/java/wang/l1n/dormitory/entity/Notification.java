package wang.l1n.dormitory.entity;

import java.util.Date;

/**
 * @author ：L1nker4
 * @date ： 创建于  2019/5/2 16:14
 * @description：  nid：通知id，title：标题，context：内容，mid：发布的管理员id
 */
public class Notification {
    private String nid;
    private String title;
    private String context;
    private Date createTime;
    private Integer mid;
    private String managerName;

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "nid='" + nid + '\'' +
                ", title='" + title + '\'' +
                ", context='" + context + '\'' +
                ", createTime=" + createTime +
                ", mid=" + mid +
                ", managerName='" + managerName + '\'' +
                '}';
    }
}
