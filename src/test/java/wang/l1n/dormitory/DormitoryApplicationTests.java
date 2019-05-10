package wang.l1n.dormitory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import wang.l1n.dormitory.entity.Notification;
import wang.l1n.dormitory.entity.Student;
import wang.l1n.dormitory.mapper.AdviceMapper;
import wang.l1n.dormitory.mapper.ManagerMapper;
import wang.l1n.dormitory.mapper.NotificationMapper;
import wang.l1n.dormitory.mapper.StudentMapper;
import wang.l1n.dormitory.service.ManagerService;
import wang.l1n.dormitory.service.NotificationService;
import wang.l1n.dormitory.utils.EncryptionUtils;
import wang.l1n.dormitory.utils.UUIDUtils;

import java.util.Date;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DormitoryApplicationTests {
    @Autowired
    EncryptionUtils encryptionUtils;
    @Autowired
    ManagerMapper managerMapper;

    @Autowired
    ManagerService managerService;

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    NotificationMapper notificationMapper;

    @Autowired
    AdviceMapper adviceMapper;

    @Autowired
    NotificationService notificationService;



    @Test
    public void contextLoads() {
    }

    @Test
    public void testManagerMapper(){
        System.out.println(managerMapper.selectManagerIdByUsername("admin"));
    }

    @Test
    public void testMD5(){
        System.out.println(encryptionUtils.getMD5("manager"));
    }

    @Test
    public void testStudentMapper(){
//        Student student = new Student();
//        student.setId(1171325146);
//        student.setName("李伟峰");
//        student.setClassname("软件1172");
//        student.setDormitory("菊苑5号楼");
//        studentMapper.addStudent(student);
        String[] ids = {"1","231"};
        studentMapper.deleteStudentByMutilId(ids);
    }

    @Test
    public void testNotificationMapper(){
//        String string = UUIDUtils.getUUID();
//        Notification notification = new Notification();
//        notification.setNid(string);
//        notification.setTitle("test");
//        notification.setContext("testtest");
//        notification.setMid(managerMapper.selectManagerIdByUsername("admin"));
//        notification.setCreateTime(new Date());
//        notificationMapper.insertNotification(notification);
//        System.out.println(notificationMapper.selectAllNotification());
        notificationMapper.deleteById("ab3bebddw05");
    }

    @Test
    public void testUUID(){
        String string = UUIDUtils.getUUID();
        System.out.println(string);
    }

    @Test
    public void testAdviceMapper(){
//        System.out.println(adviceMapper.selectAllAdvice());
        System.out.println(notificationService.getOneNotification("ab3bebddw05"));
    }

}
