# Use Java 21
FROM eclipse-temurin:21-jdk

# Create app folder
WORKDIR /app

# Copy the generated JAR file
COPY target/employee-management-system-0.0.1-SNAPSHOT.jar app.jar

# Spring Boot port
EXPOSE 8080

# Start the application
ENTRYPOINT ["java","-jar","app.jar"]