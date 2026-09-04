package com.dualagenda;

import com.dualagenda.model.Event;
import com.dualagenda.service.EventService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class DualAgendaApp {

    public static void main(String[] args) {
        EventService eventService = new EventService();
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        boolean addingEvents = true;

        while (addingEvents) {
            System.out.println("\n=== Add a New Event ===");

            System.out.print("Event title: ");
            String title = scanner.nextLine();

            System.out.print("Event description: ");
            String description = scanner.nextLine();

            System.out.print("Category (school/work/personal): ");
            String category = scanner.nextLine();

            LocalDateTime dateTime = null;
            boolean validDate = false;

            while (!validDate) {
                System.out.print("Date and time (yyyy-MM-dd HH:mm, e.g. 2026-09-05 14:00): ");
                String dateInput = scanner.nextLine();

                try {
                    dateTime = LocalDateTime.parse(dateInput, formatter);
                    validDate = true;
                } catch (DateTimeParseException e) {
                    System.out.println("That didn't match the format. Please try again.");
                }
            }

            Event newEvent = new Event(title, description, dateTime, category);
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