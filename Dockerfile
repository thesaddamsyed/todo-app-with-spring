# ---- Build stage ----
FROM maven:3.9-eclipse-temurin-17 AS builder
WORKDIR /app

# Copy the entire project
COPY . /app

# Build the application (skip tests for faster builds)
RUN mvn -ntp -DskipTests package

# ---- Runtime stage ----
FROM eclipse-temurin:17-jre
WORKDIR /app

# Set a non-root user for security
RUN useradd -ms /bin/bash appuser
USER appuser

# App runtime configuration
ENV JAVA_OPTS="-XX:MaxRAMPercentage=75.0 -XX:+UseG1GC"
ENV SPRING_DATASOURCE_URL="jdbc:h2:file:/app/data/todo-db;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE"

# Copy the built jar from the builder stage
COPY --from=builder /app/target/todo-0.0.1-SNAPSHOT.jar /app/app.jar

# Create a directory for the embedded H2 file database and mark as a volume
RUN mkdir -p /app/data
VOLUME ["/app/data"]

# Expose default Spring Boot port
EXPOSE 8080

# Render/Heroku-style platforms provide PORT env; Spring maps via server.port
CMD ["sh", "-c", "java $JAVA_OPTS -jar /app/app.jar"]
