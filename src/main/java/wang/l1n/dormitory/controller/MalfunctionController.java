package wang.l1n.dormitory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：L1nker4
 * @date ： 创建于  2019/5/15 21:32
 * @description：
 */
@Controller
@RequestMapping("/malfunction")
public class MalfunctionController {

    @RequestMapping("/list")
    public String index(){
        return "malfunction/list";
    }
}
