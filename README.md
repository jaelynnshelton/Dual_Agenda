DUAL AGENDA
A scheduling app for managing school, work, and personal plans in one place.

📌 About the Project
Dual Agenda is a scheduling application designed to bring academic, professional, and personal schedules together in one system.

The application allows users to create and manage events and tasks, organize them by category, and keep track of upcoming activities.

The project is being developed as part of my software engineering coursework, giving me the opportunity to apply programming, database, architecture, and Agile development concepts to a larger project.


💡 Why I Built This
Managing school, work, appointments, and personal plans can mean using multiple calendars and reminder apps.

I wanted to explore the idea of having these schedules in one place while still being able to separate and filter them by category.

Dual Agenda also gives me the opportunity to apply what I've learned in my software engineering courses to a project that is larger than an individual programming assignment.

✨ Features
Scheduling
Create and manage events
View calendars and schedules
Select and interact with scheduled events
Detect overlapping events
Organization
Academic, professional, and personal categories
Filter events by category
Manage tasks and completed activities
User Features
User registration and login
Event validation
Notifications and reminders
Task completion tracking
🛠️ Technologies
Technology	Used For
Java	Application development
JavaFX	User interface
CSS	Interface styling
MySQL	Database
GitHub	Version control and collaboration
GitHub Actions	CI/CD

🏗️ Architecture
Dual Agenda uses a layered architecture to separate the user interface, application functionality, and data management.

                    ┌──────────────────────┐
                    │  Presentation Layer  │
                    │                      │
                    │      JavaFX UI       │
                    └──────────┬───────────┘
                               │
                               ▼
                    ┌──────────────────────┐
                    │    Service Layer     │
                    │                      │
                    │  Application Logic   │
                    │  Event Management    │
                    │  Validation          │
                    │  Notifications       │
                    └──────────┬───────────┘
                               │
                               ▼
                    ┌──────────────────────┐
                    │      Data Layer      │
                    │                      │
                    │   Database Access    │
                    │    Data Storage      │
                    └──────────┬───────────┘
                               │
                               ▼
                         ┌──────────┐
                         │  MySQL   │
                         └──────────┘
Presentation Layer

Handles everything the user interacts with, including:

Calendar and schedule displays
Event and task input
Notifications
User interface controls
Service Layer

Handles the application's main functionality.

Current services:

AuthenticationService
ScheduleService
EventValidationService
CategoryFilterService
NotificationService
TaskCompletionService
EventSelectionService
Data Layer

Handles storing and retrieving application data.

This includes information such as:

Users
Events
Tasks
Categories
Scheduling information

🖥️ Screenshots
Screenshots will be added as the application interface is completed.

Planned Screenshots
Screen	Description
Dashboard	Main scheduling view
Calendar	View upcoming events
Event Creation	Create and manage events
Categories	Filter events by category
Notifications	View reminders and alerts

👩‍💻 My Contributions
I have contributed to the planning, structure, and development of Dual Agenda.

Architecture
Designed the layered application structure
Planned service responsibilities
Worked on separation of responsibilities
Application Development
Scheduling and event functionality
Event validation
Category filtering
Authentication
Notifications
Task completion
Project Development
Requirements planning
Project documentation
Sprint planning
Agile development
GitHub version control
CI/CD workflow

📚 Software Engineering Concepts
Through this project, I have applied:

Object-Oriented Programming
Layered Architecture
Separation of Responsibilities
Requirements Analysis
Database Design
Input Validation
User Authentication
Agile Development
Sprint Planning
Git & GitHub
CI/CD
SOLID Principles

🔄 Agile Methods
Dual Agenda is being developed using an Agile approach.

Development is broken into smaller features and tasks that can be planned, developed, tested, and improved throughout the project.

Current User Functionality
User can log into the system
User can view calendars and schedules
User can create and manage events
User can create and manage tasks
System detects overlapping events
User can mark tasks as completed
User can filter events by category
System provides alerts and notifications

📄 Project Documentation
Additional project documentation is available in the docs folder.

Document	Description
SRS	Software Requirements Specification
Architecture	Application architecture documentation
Agile Methods	Agile development approach
Sprint Backlog	Project tasks and sprint planning
Progress Reports	Development progress
Database / ERD	Database structure and relationships

🚧 Project Status
In Development

Dual Agenda is currently being developed as part of my software engineering coursework.

The application is still being built, so some features, documentation, and testing are still in progress.

🔮 Future Improvements
Improve the calendar interface
Expand reminders and notifications
Add additional filtering and sorting options
Expand database functionality
Add automated testing
Improve the GitHub Actions workflow
Deploy the application

🎯 Project Goal
The goal of Dual Agenda is to create a practical scheduling application while applying software engineering concepts throughout the development process.

The project will continue to evolve as new features are developed, tested, and refined.
