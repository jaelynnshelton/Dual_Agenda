Software Requirements Specification (SRS)
Dual Agenda

Version: 1.0 Author: Jaelynn Shelton

1. Introduction

1.1 Purpose
This document specifies the software requirements for Dual Agenda, a scheduling application designed to help users manage school, work, and personal events in one place. It is intended for use during development as a reference for what the system should do, and serves as documentation of the design and planning process for this portfolio project.

1.2 Scope
Dual Agenda allows a user to create, view, sort, and remove events, each categorized as school, work, or personal. The initial version runs as a console application; future versions will add a graphical user interface (JavaFX) and persistent storage (MySQL).

1.3 Definitions
Event: A single scheduled item with a title, description, date/time, and category.
CLI: Command-line interface — the current text-based way users interact with the app.
GUI: Graphical user interface — the planned JavaFX-based interface.

2. Overall Description

2.1 Product Perspective
Dual Agenda is a standalone application, not part of a larger system. It is being developed independently as a learning project and portfolio piece.

2.2 Product Functions (Summary)
Add a new event
View all events
View events sorted by date
Remove an event
Validate date/time input before accepting it

2.3 User Characteristics
The intended user is a single individual managing their own personal schedule — no multi-user or admin functionality is planned. The interface should be simple enough to use without instructions.

2.4 Constraints
Current version has no persistent storage; all events are lost when the program closes.
Console-only interface in the current version; no GUI yet.
Built using Java and Maven; no external event data (e.g. calendar imports) is currently supported.

2.5 Assumptions and Dependencies
Assumes the user has Java and Maven installed to run the application in its current form.
Future MySQL integration assumes the user has a MySQL server available and configured.

3. Requirements
Detailed functional and non-functional requirements are documented separately — see the requirements folder in this repository.

4. Future Requirements (Planned, Not Yet Implemented)
ID	Requirement	Description
FUT-1	Persistent Storage	The system shall store events in a MySQL database so data is retained between program runs.
FUT-2	Graphical Interface	The system shall provide a JavaFX-based GUI as an alternative to the console interface.
FUT-3	Filtering	The system shall allow the user to filter events by category or date range.

5. Appendix
5.1 Current Tech Stack
Language: Java
Build tool: Maven
Version control: Git / GitHub
Planned: JavaFX (GUI), MySQL (database)