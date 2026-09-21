# Dual Agenda — Architecture

## Overview

Dual Agenda is a scheduling application for managing school, work, and personal events. It currently runs as a console (command-line) application built in Java, with a layered structure designed to make it straightforward to add a graphical interface and a database later without rewriting the core logic.

## Architectural Style

The project follows a simplified **layered architecture** (sometimes called N-tier), separating concerns into distinct layers:

```
┌─────────────────────────────┐
│   Presentation Layer         │  DualAgendaApp.java
│   (console menu, user I/O)   │  → will become JavaFX UI
└──────────────┬────────────────┘
               │
┌──────────────▼────────────────┐
│   Service Layer                │  EventService.java
│   (business logic)             │
└──────────────┬────────────────┘
               │
┌──────────────▼────────────────┐
│   Model Layer                  │  Event.java
│   (data structure)             │
└──────────────┬────────────────┘
               │
┌──────────────▼────────────────┐
│   Data Layer (planned)         │  currently in-memory
│                                 │  → will become MySQL
└─────────────────────────────────┘
```

## Components

### Presentation Layer — `DualAgendaApp.java`
- Entry point of the application (`main` method)
- Displays the menu and reads user input via `Scanner`
- Delegates all actual logic to the Service layer — this class should only handle input/output, not business rules
- **Planned change:** replace the console menu with a JavaFX-based GUI. The service and model layers should not need to change when this happens, since they don't know or care how they're being called.

### Service Layer — `EventService.java`
- Contains the business logic: adding, retrieving, sorting, and removing events
- Acts as the middle layer between the UI and the data — the UI never touches raw data directly, it always goes through this layer
- **Planned change:** once MySQL is added, this layer will be updated to read/write to the database instead of an in-memory list. The presentation layer won't need to know the difference.

### Model Layer — `Event.java`
- A plain data class representing a single event
- Fields: `title`, `description`, `dateTime`, `category`
- No logic beyond holding and exposing this data (getters, and a constructor)

### Data Layer (planned)
- Currently: events exist only in memory (an in-memory list inside `EventService`) and are lost when the program exits
- Planned: MySQL database to persist events between runs, with `EventService` updated to perform database reads/writes instead of in-memory list operations

## Why This Structure

Separating the app into layers like this means each piece has one job:
- The UI only worries about displaying things and collecting input
- The service only worries about business rules (what counts as a valid event, how sorting works, etc.)
- The model only worries about representing an event's data

This matters practically for this project because the UI and the storage method are both about to change (console → JavaFX, in-memory → MySQL). Because the service layer sits between them, those two changes can happen independently without the service logic (or the other layer) needing to be rewritten.

## Build & Tooling

- **Language:** Java
- **Build tool:** Maven — manages dependencies and compiling via `pom.xml`
- **Version control:** Git, hosted on GitHub

## Future Architecture Additions

- **JavaFX UI layer** replacing the console-based presentation layer
- **MySQL integration** replacing in-memory storage in the service layer
- Possible addition of a dedicated Data Access Object (DAO) layer between the Service and Data layers once MySQL is introduced, to keep database-specific code (SQL queries) separate from business logic
