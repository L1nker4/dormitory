package wang.l1n.dormitory.entity;

import java.util.Date;

/**
 * @author ：L1nker4
 * @date ： 创建于  2019/5/8 15:22
 * @description：
 */
public class Advertisement {
    private String aid;
    private String title;
    private String context;
    private Date createTime;
    private Integer mid;
    private Manager manager;

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
