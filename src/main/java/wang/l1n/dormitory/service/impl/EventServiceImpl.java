package wang.l1n.dormitory.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wang.l1n.dormitory.entity.Event;
import wang.l1n.dormitory.mapper.EventMapper;
import wang.l1n.dormitory.service.EventService;

import java.util.List;

/**
 * @author ：L1nker4
 * @date ： 创建于  2019/5/16 11:21
 * @description：
 */
@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventMapper eventMapper;

    @Override
    public List<Event> getEventList() {
        return eventMapper.getEventList();
    }
}
