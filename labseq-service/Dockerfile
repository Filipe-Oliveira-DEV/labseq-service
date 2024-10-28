# Use the official Maven image for the build stage
FROM maven:3.8.5-openjdk-17 AS build

# Set the working directory
WORKDIR /app

# Copy the pom.xml and the source code into the container
COPY pom.xml .
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Use the official OpenJDK image for the runtime stage
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the built jar file from the build stage
COPY --from=build /app/target/labseq-service-0.0.1-SNAPSHOT.jar labseq-service.jar

# Specify the entry point
ENTRYPOINT ["java", "-jar", "labseq-service.jar"]
