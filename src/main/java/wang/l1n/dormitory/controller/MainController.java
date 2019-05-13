package wang.l1n.dormitory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import wang.l1n.dormitory.service.AdviceService;
import wang.l1n.dormitory.service.NotificationService;

/**
 * @author ：L1nker4
 * @date ： 创建于  2019/4/21 16:18
 * @description：
 */
@Controller
public class MainController {
    @Autowired
    private NotificationService notificationService;

    @Autowired
    private AdviceService adviceService;
    @RequestMapping("/main")
    public String toMain(Model model) {
        int notificationNum = notificationService.getNumberOfNotification();
        int adviceNum = adviceService.getAdviceNum();
        model.addAttribute("advice", adviceNum);
        model.addAttribute("notification", notificationNum);
        return "main";
    }

    @RequestMapping("/unAuth")
    public String toUnAuth(){
        return "unAuth";
    }
}
