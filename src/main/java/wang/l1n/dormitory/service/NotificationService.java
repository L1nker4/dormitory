package wang.l1n.dormitory.service;

import wang.l1n.dormitory.dto.BaseResult;
import wang.l1n.dormitory.entity.Notification;

import java.util.List;

public interface NotificationService {
    /**
     * 添加通知
     * @param notification
     * @return
     */
    public BaseResult insertNotification(Notification notification);

    /**
     * 获取所有通知
     * @return
     */
    public List<Notification> getAllNotification();

    Notification getOneNotification(String nid);

    void deleteNotification(String nid);
}
