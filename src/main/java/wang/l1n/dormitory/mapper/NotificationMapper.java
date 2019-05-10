package wang.l1n.dormitory.mapper;

import wang.l1n.dormitory.entity.Notification;

import java.util.List;

public interface NotificationMapper {
    /**
     * 添加通知
     * @param notification
     */
    void insertNotification(Notification notification);

    /**
     * 获取所有通知
     * @return
     */
    List<Notification> selectAllNotification();

    void deleteNotificationById(String nid);

    /**
     * 根据Id获取通知信息
     * @param nid
     * @return
     */
    Notification selectNotificationById(String nid);

    void deleteById(String nid);
}
