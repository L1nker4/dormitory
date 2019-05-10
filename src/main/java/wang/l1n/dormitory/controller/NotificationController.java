package wang.l1n.dormitory.controller;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import wang.l1n.dormitory.dto.BaseResult;
import wang.l1n.dormitory.entity.Manager;
import wang.l1n.dormitory.entity.Notification;
import wang.l1n.dormitory.mapper.ManagerMapper;
import wang.l1n.dormitory.service.NotificationService;
import wang.l1n.dormitory.utils.UUIDUtils;

import java.util.Date;
import java.util.List;

/**
 * @author ：L1nker4
 * @date ： 创建于  2019/5/1 22:05
 * @description：
 */
@Controller
@RequestMapping("/notification")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private ManagerMapper managerMapper;

    /**
     * 跳转添加页面
     * @return
     */
    @GetMapping("/add")
    public String toAdd(){
        return "notification/add";
    }

    /**
     * 添加操作
     * @param notification
     * @param model
     * @return
     */
    @PostMapping("/doAdd")
    public String addNotification(Notification notification, RedirectAttributes model){
        BaseResult baseResult = null;
        if (StringUtils.isNotBlank(notification.getContext()) && StringUtils.isNotBlank(notification.getTitle())){
            Manager manager = (Manager) SecurityUtils.getSubject().getPrincipal();
            notification.setNid(UUIDUtils.getUUID());
            notification.setCreateTime(new Date());
            notification.setMid(managerMapper.selectManagerIdByUsername(manager.getUsername()));
            baseResult = notificationService.insertNotification(notification);
            model.addFlashAttribute("message", baseResult.getMessage());
        }else {
            baseResult = BaseResult.fail("添加失败");
            model.addFlashAttribute("message", baseResult.getMessage());
        }
        return "redirect:index";
    }

    /**
     * 通知列表
     * @return
     */
    @GetMapping("index")
    public String getNotification(Model model){
        List<Notification> list = notificationService.getAllNotification();
        model.addAttribute("notification", list);
        return "notification/list";
    }

    /**
     * 获取详细信息
     * @param nid
     * @return
     */
    @RequestMapping(value = "detail/{nid}",method = RequestMethod.POST)
    @ResponseBody
    public BaseResult getDetail(@PathVariable("nid") String nid){
        BaseResult baseResult = new BaseResult();
        if (StringUtils.isNotBlank(nid)){
            Notification notification = notificationService.getOneNotification(nid);
            baseResult.setStatus(200);
            baseResult.getMap().put("detail", notification);
        }else {
            baseResult.setStatus(404);
            baseResult.setMessage("程序异常，请重试");
        }
        return baseResult;
    }

    @ResponseBody
    @RequestMapping(value = "delete/{nid}",method = RequestMethod.POST)
    public BaseResult deleteNotification(@PathVariable("nid") String nid){
        BaseResult baseResult = new BaseResult();
        if (StringUtils.isNotBlank(nid)){
            notificationService.deleteNotification(nid);
            baseResult.setStatus(200);
            baseResult.setMessage("删除成功");
        }else {
            baseResult.setStatus(404);
            baseResult.setMessage("请传入有效参数！");
        }
        return baseResult;
    }



}
