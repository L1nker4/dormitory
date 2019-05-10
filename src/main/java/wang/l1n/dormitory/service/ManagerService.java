package wang.l1n.dormitory.service;

import wang.l1n.dormitory.entity.Manager;

public interface ManagerService {
    Manager checkLogin(String username);
}
