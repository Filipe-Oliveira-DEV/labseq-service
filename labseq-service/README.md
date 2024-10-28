# LabSeq Service

## Overview
LabSeq Service is a RESTful API built with Spring Boot that calculates values in a custom sequence called "LabSeq." The service includes caching for optimized performance and provides Docker support for containerization.

## Table of Contents
- [Steps](#steps)
- [Dockerization](#dockerization)
- [API Documentation](#api-documentation)
- [Endpoints](#endpoints)
- [Error Handling](#error-handling)

# Steps

### Clone the Repository
Clone the repository to your local machine:
```bash
git clone <repository-url>
cd labseq-service
```


### Build the Project with Maven
Build the project, skipping tests if desired:
```bash
mvn clean package -DskipTests
````

### Run the Application Locally
To start the application locally, use the following Maven command:

```bash
mvn spring-boot:run
```
The application will start at http://localhost:8080.

## Dockerization
To containerize the LabSeq project, follow these steps:

### Build the Docker Image
Ensure you’re in the project root directory, then run:

```bash
docker build -t labseqservice .
````

### Run the Docker Container
To start the container, map the service to port 8080:

```bash
docker run -p 8080:8080 labseqservice
```


## API Documentation
The project uses Springdoc OpenAPI for automatically generated API documentation.

### Access Swagger UI
Visit the interactive API documentation at:
- http://localhost:8080/swagger-ui/index.html

### Access OpenAPI JSON
The OpenAPI JSON specification is available at:
- http://localhost:8080/v3/api-docs

### Endpoints
##### Get LabSeq Value by Index
- **Endpoint:** GET /labseq/{n}
- **Description:** Returns the LabSeq value at the specified index.
- **Example Request:** GET http://localhost:8080/labseq/5
- **Response:** Returns the LabSeq value at index 5 in JSON format.

## Error Handling
- **400 Bad Request:** Returned for invalid inputs, such as negative indices.
- **404 Not Found:** Returned if the specified LabSeq value cannot be found.
