package wang.l1n.dormitory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import wang.l1n.dormitory.dto.BaseResult;
import wang.l1n.dormitory.entity.Event;
import wang.l1n.dormitory.service.EventService;

import java.util.List;

/**
 * @author ：L1nker4
 * @date ： 创建于  2019/5/16 11:00
 * @description：
 */
@RequestMapping("/event")
@Controller
public class EventController {

    @Autowired
    private EventService eventService;

    @RequestMapping("/list")
    public String index(Model model){
        List<Event> events = eventService.getEventList();
        model.addAttribute("events", events);
        return "event/list";
    }

    @RequestMapping("/detail/{eid}")
    @ResponseBody
    public BaseResult getDetail(@PathVariable("eid") int eid){
        BaseResult baseResult = new BaseResult();
        Event event = eventService.getEventDetail(eid);
        baseResult.setStatus(200);
        baseResult.getMap().put("event", event);
        return baseResult;
    }

    @RequestMapping("/add")
    public String add(){
        return "event/add";
    }

}
