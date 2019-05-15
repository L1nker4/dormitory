package wang.l1n.dormitory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import wang.l1n.dormitory.entity.Malfunction;
import wang.l1n.dormitory.service.MalfunctionService;

import java.util.List;

/**
 * @author ：L1nker4
 * @date ： 创建于  2019/5/15 21:32
 * @description：
 */
@Controller
@RequestMapping("/malfunction")
public class MalfunctionController {

    @Autowired
    private MalfunctionService malfunctionService;

    @RequestMapping("/list")
    public String index(Model model){
        List<Malfunction> malfunctions = malfunctionService.getMalfunctionList();
        model.addAttribute("malfunctions", malfunctions);
        return "malfunction/list";
    }

}
