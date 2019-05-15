package wang.l1n.dormitory.entity;

/**
 * @author ：L1nker4
 * @date ： 创建于  2019/5/15 21:30
 * @description： 故障信息
 */
public class Malfunction {
    private int mid;
    private String title;
    private String context;
    private String dormitoryName;

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
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

    public String getDormitoryName() {
        return dormitoryName;
    }

    public void setDormitoryName(String dormitoryName) {
        this.dormitoryName = dormitoryName;
    }
}
