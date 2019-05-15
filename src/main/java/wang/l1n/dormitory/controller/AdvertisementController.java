package wang.l1n.dormitory.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import wang.l1n.dormitory.dto.BaseResult;
import wang.l1n.dormitory.entity.Advertisement;
import wang.l1n.dormitory.service.AdvertisementService;

import java.util.List;

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
    public String index(Model model){
        List<Advertisement> advertisements = advertisementService.getAdvertisementList();
        model.addAttribute("advertisement", advertisements);
        return "advertisement/list";
    }

    @RequestMapping("add")
    public String toAdd(){
        return "advertisement/add";
    }

    @RequestMapping(value = "/doAdd",method = RequestMethod.POST)
    public String doAdd(Advertisement advertisement, RedirectAttributes redirectAttributes){
        BaseResult baseResult = new BaseResult();
        if (StringUtils.isNotBlank(advertisement.getTitle()) && StringUtils.isNotBlank(advertisement.getContext())){
            baseResult = advertisementService.insertAdvertisement(advertisement);
            redirectAttributes.addFlashAttribute("result", baseResult);
        }else {
            baseResult.setStatus(404);
            baseResult.setMessage("请输入内容");
            redirectAttributes.addFlashAttribute("result", baseResult);
        }
        return "advertisement/list";
    }
}
