package com.dualagenda;

import com.dualagenda.model.Event;
import com.dualagenda.service.EventService;

import java.util.List;

public class DualAgendaApp {

    public static void main(String[] args) {
        EventService eventService = new EventService();

        Event testEvent = new Event();
        eventService.addEvent(testEvent);

        List<Event> events = eventService.getAllEvents();
        System.out.println("Number of events: " + events.size());

        for (Event e : events) {
            System.out.println(e);
        }
    }
}