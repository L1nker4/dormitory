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
    private Date createTime;
    private Integer mid;
    private String managerName;

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

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
}
