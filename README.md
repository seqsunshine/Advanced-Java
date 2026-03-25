Landon Hotel Application <br>
Overview <br>
The Landon Hotel Application is a full-stack web application built using Spring Boot (Java) and Angular that simulates a hotel booking and information system. The application integrates backend services, frontend UI, and database persistence to deliver features such as room reservations, internationalized content, and real-time availability filtering.
This project demonstrates practical experience with layered architecture, REST API design, concurrency, and frontend-backend integration. <br>
Key Features <br>
Multithreaded Internationalization (i18n) <br>
-Retrieves localized welcome messages concurrently using Java multithreading <br>
-Uses resource bundles to support multiple locales (e.g., English and French) <br>
-Exposes translations through a REST endpoint consumed by the frontend <br>
Full-Stack Integration <br>
-Angular frontend communicates with Spring Boot backend via REST APIs <br>
-Dynamic data rendering (welcome messages, room availability, presentation times) <br>
-Angular app bootstrapped and served through Spring static resources br>
Room Reservation System <br>
-Search for available rooms based on check-in and check-out dates <br>
-Reservation requests sent to backend API <br>
-Backend handles filtering and persistence logic <br>
Timezone-Aware Scheduling <br>
-Backend service generates presentation times across multiple time zones <br>
-Frontend dynamically renders results for users <br>
Layered Backend Architecture <br>
-Controller layer (API endpoints) <br>
-Service layer (business logic) <br>
-Repository layer (data access with JPA) <br>
-Conversion layer (DTO ↔ Entity mapping) <br>
Database Integration <br>
-H2 database configured for local development <br>
-JPA/Hibernate used for ORM <br>
-Data bootstrapped on application startup <br>
Frontend Highlights <br>
-Built with Angular (TypeScript, RxJS) <br>
-Reactive forms for room search and booking <br>
-HTTP client integration with retry and error handling <br>
-Dynamic UI rendering of backend data: <br>
--Welcome messages injected into navigation <br>
--Room listings with currency conversion <br>
--Presentation times from API <br>
Tech Stack <br>
Backend <br>
-Java 17 <br>
-Spring Boot <br>
-Spring Data JPA <br>
-Hibernate <br>
Frontend <br>
-Angular 14 <br>
-TypeScript <br>
-RxJS <br>
Database <br>
-H2 (development) <br>
-MySQL driver included for extensibility <br>
Build Tools <br>
-Maven <br>
-Angular CLI
