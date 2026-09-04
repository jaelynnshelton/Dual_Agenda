package com.dualagenda.service;

import com.dualagenda.model.Event;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EventService {

    private final List<Event> events = new ArrayList<>();

    public void addEvent(Event event) {
        events.add(event);
    }

    public List<Event> getAllEvents() {
        return events;
    }

    public boolean removeEvent(Event event) {
        return events.remove(event);
    }

    public List<Event> getAllEventsSortedByDate() {
        List<Event> sorted = new ArrayList<>(events);
        sorted.sort(Comparator.comparing(Event::getDateTime));
        return sorted;
    }
}