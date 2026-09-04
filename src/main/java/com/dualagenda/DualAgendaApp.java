package com.dualagenda;

import com.dualagenda.model.Event;
import com.dualagenda.service.EventService;

import java.util.List;
import java.util.Scanner;

public class DualAgendaApp {

    public static void main(String[] args) {
        EventService eventService = new EventService();
        Scanner scanner = new Scanner(System.in);

        boolean addingEvents = true;

        while (addingEvents) {
            System.out.println("\n=== Add a New Event ===");

            System.out.print("Event title: ");
            String title = scanner.nextLine();

            System.out.print("Event description: ");
            String description = scanner.nextLine();

            System.out.print("Category (school/work/personal): ");
            String category = scanner.nextLine();

            Event newEvent = new Event(title, description, null, category);
            eventService.addEvent(newEvent);

            System.out.print("\nAdd another event? (y/n): ");
            String answer = scanner.nextLine();

            if (!answer.equalsIgnoreCase("y")) {
                addingEvents = false;
            }
        }

        System.out.println("\n=== All Events ===");
        List<Event> events = eventService.getAllEvents();
        System.out.println("Number of events: " + events.size());

        for (Event e : events) {
            System.out.println(e);
        }

        scanner.close();
    }
}
