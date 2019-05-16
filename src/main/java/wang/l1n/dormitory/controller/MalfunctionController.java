package wang.l1n.dormitory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import wang.l1n.dormitory.dto.BaseResult;
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

    @RequestMapping(value = "/detail/{id}",method = RequestMethod.GET)
    @ResponseBody
    public BaseResult getDetail(@PathVariable("id") int id){
        BaseResult baseResult = new BaseResult();
        Malfunction malfunction = malfunctionService.getMalfunctionDetail(id);
        baseResult.setStatus(200);
        baseResult.setMessage("查询成功");
        baseResult.getMap().put("malfunction", malfunction);
        return baseResult;
    }

}
