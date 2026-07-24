# Employee Management System

A RESTful Employee Management System developed using **Spring Boot**, **Spring Security**, **JWT Authentication**, **Spring Data JPA**, and **MySQL**. The application provides secure user authentication and complete Employee CRUD (Create, Read, Update, Delete) operations. APIs are documented using **Swagger OpenAPI** and the application is deployed on **Railway**.

## Live Demo

* **Application:** https://employee-management-system-production-a911.up.railway.app
* **Swagger UI:** https://employee-management-system-production-a911.up.railway.app/swagger-ui/index.html

## Features

* User Registration
* User Login with JWT Authentication
* Secure REST APIs using Spring Security
* Employee CRUD Operations

  * Add Employee
  * View All Employees
  * Update Employee Details
  * Delete Employee
* MySQL Database Integration
* API Documentation using Swagger OpenAPI
* Cloud Deployment using Railway

## Technology Stack

### Backend

* Java 21
* Spring Boot 3
* Spring MVC
* Spring Data JPA
* Spring Security
* JWT Authentication

### Database

* MySQL

### Tools & Technologies

* Maven
* Swagger OpenAPI
* Git & GitHub
* Railway

## Project Structure

```text
src
├── controller
├── service
├── repository
├── model
├── dto
├── security
├── config
├── exception
└── resources
```

## API Endpoints

| Method | Endpoint            | Description        |
| ------ | ------------------- | ------------------ |
| POST   | /api/auth/register  | Register User      |
| POST   | /api/auth/login     | Login User         |
| GET    | /api/employees      | Get All Employees  |
| GET    | /api/employees/{id} | Get Employee by ID |
| POST   | /api/employees      | Add Employee       |
| PUT    | /api/employees/{id} | Update Employee    |
| DELETE | /api/employees/{id} | Delete Employee    |

## How to Run

1. Clone the repository.
2. Configure MySQL database settings in `application.properties`.
3. Run the project using:

```bash
mvn spring-boot:run
```

4. Open Swagger UI:

```
http://localhost:8080/swagger-ui/index.html
```

## Future Enhancements

* Role-Based Authorization (Admin/User)
* Pagination and Sorting
* Search and Filter Employees
* Docker Support
* CI/CD Pipeline
* Unit and Integration Testing

## Author

**Perla Manasa**
