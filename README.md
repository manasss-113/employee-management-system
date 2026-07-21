# Employee Management System

A secure Employee Management System built using **Java**, **Spring Boot**, **Spring Security**, **JWT Authentication**, and **MySQL**. This REST API allows users to register, log in, and securely manage employee records.

---

## Features

- User Registration
- User Login with JWT Authentication
- Spring Security Integration
- Employee CRUD Operations
    - Create Employee
    - View Employees
    - Update Employee
    - Delete Employee
- MySQL Database Integration
- RESTful APIs
- Swagger API Documentation
- Docker Support

---

## Tech Stack

### Backend
- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- JWT Authentication
- Maven

### Database
- MySQL

### Tools
- Git
- GitHub
- Docker
- Swagger (OpenAPI)

---

## Project Structure

```
employee-management-system
│── src
│   ├── controller
│   ├── service
│   ├── repository
│   ├── entity
│   ├── dto
│   ├── security
│   ├── exception
│   └── config
│
├── Dockerfile
├── pom.xml
├── README.md
└── .gitignore
```

---

## REST API Endpoints

### Authentication

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/auth/register` | Register a new user |
| POST | `/auth/login` | Login and receive JWT token |

### Employee

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/employees` | Get all employees |
| GET | `/employees/{id}` | Get employee by ID |
| POST | `/employees` | Create employee |
| PUT | `/employees/{id}` | Update employee |
| DELETE | `/employees/{id}` | Delete employee |

---

## Swagger Documentation

After starting the application, open:

```
http://localhost:8080/swagger-ui/index.html
```

---

## Database Configuration

Update the following properties in:

```
src/main/resources/application.properties
```

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_management
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
```

---

## Running the Project

### Clone the Repository

```bash
git clone https://github.com/manasss-113/employee-management-system.git
```

### Navigate to Project

```bash
cd employee-management-system
```

### Build the Project

```bash
mvn clean install
```

### Run the Application

```bash
mvn spring-boot:run
```

The application will start on:

```
http://localhost:8080
```

---

## Docker

### Build Docker Image

```bash
docker build -t employee-management-system .
```

### Run Docker Container

```bash
docker run -p 8080:8080 employee-management-system
```

---

## Future Enhancements

- Role-Based Authorization
- Pagination & Sorting
- Employee Search
- File Upload
- Email Notifications
- Unit Testing using JUnit & Mockito

---

## Author

**Perla Manasa**

GitHub: https://github.com/manasss-113

LinkedIn: *(Add your LinkedIn profile URL here)*

---

## Skills Demonstrated

- Core Java
- Spring Boot
- Spring Security
- JWT Authentication
- REST API Development
- MySQL
- SQL
- Maven
- Docker
- Git & GitHub
- Swagger (OpenAPI)

---

## License

This project is developed for learning and portfolio purposes.