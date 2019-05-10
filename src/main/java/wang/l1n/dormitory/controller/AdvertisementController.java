package wang.l1n.dormitory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：L1nker4
 * @date ： 创建于  2019/5/6 14:05
 * @description：
 */
@Controller
@RequestMapping("advertisement")
public class AdvertisementController {
    @RequestMapping("index")
    public String idnex(){
        return "advertisement/list";
    }

    @RequestMapping("add")
    public String toAdd(){
        return "advertisement/add";
    }
}
