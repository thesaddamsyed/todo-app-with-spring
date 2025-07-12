# Todo List Spring Boot Application

A simple Todo List web application built with Spring Boot, Thymeleaf, Spring Data JPA, and MySQL.

## Features
- Add, view, toggle, and delete todo tasks
- Tasks are persisted in a MySQL database
- Responsive UI with Bootstrap 5 and Thymeleaf

## Project Structure
- **Entity:** `src/main/java/com/embarkx/todo/entities/Task.java`
- **Repository:** `src/main/java/com/embarkx/todo/repositories/TaskRepository.java`
- **Service:** `src/main/java/com/embarkx/todo/services/TaskService.java`
- **Controller:** `src/main/java/com/embarkx/todo/controllers/TaskController.java`
- **Templates:** `src/main/resources/templates/tasks.html`
- **Configuration:** `src/main/resources/application.properties`

## Getting Started

### Prerequisites
- Java 17 or later
- Maven
- MySQL server running (default: `localhost:3306`, database: `todo-app`)
- [Lombok](https://projectlombok.org/) plugin enabled in your IDE

### Setup
1. Clone the repository:
   ```sh
   git clone <repo-url>
   cd todo
   ```
2. Configure your MySQL credentials in `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/todo-app
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```
3. Create the database if it doesn't exist:
   ```sql
   CREATE DATABASE `todo-app`;
   ```

### Build & Run
- Build the project:
  ```sh
  ./mvnw clean verify
  ```
- Run the application:
  ```sh
  ./mvnw spring-boot:run
  ```
- Access the app at [http://localhost:8080](http://localhost:8080)

### Testing
- Run tests:
  ```sh
  ./mvnw test
  ```

## Usage
- Add a new task using the input field and "Add Task" button.
- Toggle a task's completion status with the "Toggle" button.
- Delete a task with the "Delete" button.

## Customization
- Update Bootstrap or UI in `src/main/resources/templates/tasks.html`.
- Add new features by following the service/repository/controller pattern.

## License
MIT License
