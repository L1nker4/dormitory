package wang.l1n.dormitory.mapper;

import org.apache.ibatis.annotations.Mapper;
import wang.l1n.dormitory.entity.Manager;

@Mapper
public interface ManagerMapper {
    /**
     * 根据用户名查询管理员
     * @param username
     * @return
     */
    Manager selectManagerByUsername(String username);

    /**
     * 根据用户名获取用户ID
     * @param username
     * @return
     */
    int selectManagerIdByUsername(String username);
}
