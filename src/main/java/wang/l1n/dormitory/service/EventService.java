package wang.l1n.dormitory.service;

import wang.l1n.dormitory.entity.Event;

import java.util.List;

public interface EventService {
    List<Event> getEventList();

    Event getEventDetail(int eid);
}
