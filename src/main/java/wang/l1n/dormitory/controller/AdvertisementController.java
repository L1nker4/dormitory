package wang.l1n.dormitory.controller;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import wang.l1n.dormitory.dto.BaseResult;
import wang.l1n.dormitory.entity.Advertisement;
import wang.l1n.dormitory.entity.Manager;
import wang.l1n.dormitory.service.AdvertisementService;

/**
 * @author ：L1nker4
 * @date ： 创建于  2019/5/6 14:05
 * @description：
 */
@Controller
@RequestMapping("advertisement")
public class AdvertisementController {

    @Autowired
    private AdvertisementService advertisementService;

    @RequestMapping("index")
    public String idnex(){
        return "advertisement/list";
    }

    @RequestMapping("add")
    public String toAdd(){
        return "advertisement/add";
    }

    @RequestMapping(value = "/doAdd",method = RequestMethod.POST)
    public String doAdd(Advertisement advertisement, Model model){
        BaseResult baseResult = new BaseResult();
        if (StringUtils.isNotBlank(advertisement.getTitle()) && StringUtils.isNotBlank(advertisement.getContext())){
            baseResult = advertisementService.insertAdvertisement(advertisement);
            model.addAttribute("result", baseResult);
        }else {
            baseResult.setStatus(404);
            baseResult.setMessage("请输入内容");
            model.addAttribute("result",baseResult);
        }
        return "advertisement/list";
    }
}
