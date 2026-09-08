# Dual Agenda

A scheduling app for juggling school, work, and personal events — built as a portfolio project while completing my Associate of Science in Software Engineering.

I built this from scratch to learn real-world development: version control, build tools, debugging, and turning a rough idea into working software one feature at a time.

## Status

🚧 **In progress.** Currently a fully functional console application. Next up: a JavaFX graphical interface and MySQL for persistent storage.

## Features (current)

- Add new events with title, description, category, and date/time
- View all events
- View events sorted by date
- Remove an event
- Input validation on date/time entries (won't crash on bad input — asks again instead)
- Add multiple events in a single run via a simple menu

## Planned

- JavaFX-based graphical user interface
- MySQL database integration for persistent storage (currently in-memory only — events don't persist between runs)
- Additional filtering options (by category, by date range)

## Tech Stack

- **Language:** Java
- **Build tool:** Maven
- **UI (planned):** JavaFX
- **Database (planned):** MySQL
- **Version control:** Git / GitHub

## How to Run

1. Clone the repo:
   ```
   git clone https://github.com/jaelynnshelton/Dual_Agenda.git
   ```
2. Navigate into the project folder and compile:
   ```
   mvn compile
   ```
3. Run the app:
   ```
   mvn compile exec:java "-Dexec.mainClass=com.dualagenda.DualAgendaApp"
   ```
4. Follow the on-screen menu to add, view, sort, or remove events.

## Project Documentation

This repo also includes supporting documentation from the software engineering process:

- Software Requirements Specification (SRS)
- Architecture documentation
- Agile / sprint planning docs
- Entity-Relationship Diagram (ERD)

## Screenshots

*(Add a screenshot of the console menu in action here — see the `/screenshots` folder.)*

## What I Learned

This project has been my first real experience with the full development workflow outside of a classroom: setting up Git properly, debugging environment issues (like build tool PATH configuration and filename typos breaking Maven), writing input validation that doesn't crash on bad user input, and structuring a menu-driven application. It's a work in progress, and I'm continuing to build on it as I learn.

## About Me

Software Engineering student (AS, expected January 2027) working toward a career in IT Support / Help Desk, with a longer-term goal of moving into cybersecurity.