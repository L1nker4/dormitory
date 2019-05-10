package wang.l1n.dormitory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：L1nker4
 * @date ： 创建于  2019/4/21 16:18
 * @description：
 */
@Controller
public class MainController {
    @RequestMapping("/main")
    public String toMain() {
        return "main";
    }

    @RequestMapping("/unAuth")
    public String toUnAuth(){
        return "unAuth";
    }
}
