package wang.l1n.dormitory.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ：L1nker4
 * @date ： 创建于  2019/4/21 14:39
 * @description：
 */
public class Manager implements Serializable {
    private Integer mid;
    private String username;
    private String password;
    private Set<Role> roles = new HashSet<>();

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}