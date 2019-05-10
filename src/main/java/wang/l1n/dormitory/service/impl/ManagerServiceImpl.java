package wang.l1n.dormitory.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wang.l1n.dormitory.entity.Manager;
import wang.l1n.dormitory.mapper.ManagerMapper;
import wang.l1n.dormitory.service.ManagerService;

/**
 * @author ：L1nker4
 * @date ： 创建于  2019/4/22 12:28
 * @description：
 */
@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public Manager checkLogin(String username) {
        return managerMapper.selectManagerByUsername(username);
    }
}
