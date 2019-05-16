package wang.l1n.dormitory.mapper;

import wang.l1n.dormitory.entity.Event;

import java.util.List;

public interface EventMapper {
    List<Event> getEventList();

    Event getEventDetail(int eid);
}
