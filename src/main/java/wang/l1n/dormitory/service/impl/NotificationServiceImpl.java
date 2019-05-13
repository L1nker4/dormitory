package wang.l1n.dormitory.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wang.l1n.dormitory.dto.BaseResult;
import wang.l1n.dormitory.entity.Notification;
import wang.l1n.dormitory.mapper.NotificationMapper;
import wang.l1n.dormitory.service.NotificationService;

import java.util.List;

/**
 * @author ：L1nker4
 * @date ： 创建于  2019/5/2 18:31
 * @description：
 */
@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    NotificationMapper notificationMapper;

    /**
     * 添加通知
     * @param notification
     * @return
     */
    @Override
    public BaseResult insertNotification(Notification notification) {
        notificationMapper.insertNotification(notification);
        return BaseResult.success("添加成功");
    }

    /**
     * 查询所有通知
     * @return
     */
    @Override
    public List<Notification> getAllNotification() {
        return notificationMapper.selectAllNotification();
    }

    /**
     * 获取一个通知的详细信息
     * @param nid
     * @return
     */
    @Override
    public Notification getOneNotification(String nid) {
        return notificationMapper.selectNotificationById(nid);
    }

    /**
     * 删除一条通知
     * @param nid
     */
    @Override
    public void deleteNotification(String nid) {
        notificationMapper.deleteById(nid);
    }

    @Override
    public int getNumberOfNotification() {
        return notificationMapper.getNumberOfNotification();
    }


}
