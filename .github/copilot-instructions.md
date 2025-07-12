# Copilot Instructions for AI Agents

## Project Overview

- This is a Spring Boot Todo List application using Java, Maven, Spring Data JPA, Thymeleaf, and MySQL.
- The main entry point is `src/main/java/com/embarkx/todo/TodoApplication.java`.
- The core domain entity is `Task` (`entities/Task.java`), representing a todo item with fields: `id`, `title`, `description`, and `completed`.
- The application follows a standard layered architecture:
  - **Controller**: Handles HTTP requests (see `controllers/TaskController.java`).
  - **Service**: Business logic (see `services/TaskService.java`).
  - **Repository**: Data access using Spring Data JPA (`repositories/TaskRepository.java`).

## Key Patterns & Conventions

- Use constructor injection for all service and controller dependencies.
- All entity classes are annotated with `@Entity` and use Lombok's `@Data` for boilerplate code.
- Repository interfaces extend `JpaRepository<Entity, ID>` for CRUD operations.
- Thymeleaf templates (for web UI) are placed in `src/main/resources/templates/` (not present by default).
- Application configuration is in `src/main/resources/application.properties`.
- Use `@Service` for service classes and `@Controller` for controllers.

## Build, Run, and Test

- Build and test with Maven:
  - Build: `mvnw clean verify` or use the VS Code task `verify`.
  - Test: `mvnw test` or use the VS Code task `test`.
- The application expects a running MySQL instance (see `application.properties` for connection details).
- To run locally: `mvnw spring-boot:run` or run the main class from your IDE.

## Integration & External Dependencies

- Uses MySQL as the database. Ensure the database and credentials match those in `application.properties`.
- Uses Lombok for reducing boilerplate (ensure Lombok plugin is enabled in your IDE).
- Uses Spring Data JPA for ORM and repository abstraction.

## Example: Adding a New Feature

- To add a new entity:
  1. Create a new class in `entities/` with `@Entity` and Lombok annotations.
  2. Create a corresponding repository in `repositories/` extending `JpaRepository`.
  3. Add service and controller logic as needed, following the existing patterns.

## Notable Files & Directories

- `src/main/java/com/embarkx/todo/entities/Task.java`: Main entity.
- `src/main/java/com/embarkx/todo/repositories/TaskRepository.java`: JPA repository.
- `src/main/java/com/embarkx/todo/services/TaskService.java`: Business logic.
- `src/main/java/com/embarkx/todo/controllers/TaskController.java`: Web controller.
- `src/main/resources/application.properties`: Configuration.

## Project-Specific Tips

- Always use constructor injection for testability and immutability.
- Keep business logic in services, not controllers.
- Use repository interfaces for all database access.
- If you add new dependencies, update `pom.xml` accordingly.

---

If you are unsure about any workflow or pattern, check the existing files for examples before introducing new approaches.
