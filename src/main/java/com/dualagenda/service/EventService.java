package com.dualagenda.service;

import com.dualagenda.model.Event;
import java.util.ArrayList;
import java.util.List;

public class EventService {

    private final List<Event> events = new ArrayList<>();

    public void addEvent(Event event) {
        events.add(event);
    }

    public List<Event> getAllEvents() {
        return events;
    }
}