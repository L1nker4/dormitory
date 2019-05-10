package wang.l1n.dormitory.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import wang.l1n.dormitory.dto.BaseResult;
import wang.l1n.dormitory.entity.Advice;
import wang.l1n.dormitory.service.AdviceService;

import java.util.List;

/**
 * @author ：L1nker4
 * @date ： 创建于  2019/5/3 16:45
 * @description：
 */
@Controller
@RequestMapping("/advice")
public class AdviceController {

    @Autowired
    private AdviceService adviceService;

    /**
     * 返回通知首页
     * @param model
     * @return
     */
    @RequestMapping("/index")
    public String toAdvice(Model model){
        List<Advice> list = adviceService.getAllAdvice();
        model.addAttribute("advice", list);
        return "advice/list";
    }

    /**
     * 获取详细信息
     * @param aid
     * @return
     */
    @ResponseBody
    @RequestMapping("detail/{aid}")
    public BaseResult getAdviceDetail(@PathVariable("aid") String aid){
        BaseResult baseResult = new BaseResult();
        if (StringUtils.isNotBlank(aid)){
            Advice detailAdvice = adviceService.getAdviceById(aid);
            baseResult.setStatus(200);
            baseResult.getMap().put("detail", detailAdvice);
        } else {
            baseResult.setStatus(404);
            baseResult.setMessage("程序异常，请重试");
        }
        return baseResult;
    }


}
