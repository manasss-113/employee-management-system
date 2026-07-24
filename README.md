# Employee Management System

A RESTful Employee Management System developed using **Spring Boot**, **Spring Security**, **JWT Authentication**, **Spring Data JPA**, and **MySQL**. The application provides secure user authentication and complete Employee CRUD (Create, Read, Update, Delete) operations. APIs are documented using **Swagger OpenAPI** and deployed on **Railway**.

---

## 🚀 Live Demo

**Application:**  
https://employee-management-system-production-a911.up.railway.app/

**Swagger UI:**  
https://employee-management-system-production-a911.up.railway.app/swagger-ui/index.html

---

## 📸 Screenshots

### Home API

![Home API](screenshots/home-page.png)

### Swagger UI

![Swagger UI](screenshots/swagger-ui.png)

---

## ✨ Features

- User Registration
- User Login with JWT Authentication
- Secure REST APIs using Spring Security
- Employee CRUD Operations
  - Add Employee
  - View All Employees
  - Get Employee by ID
  - Update Employee
  - Delete Employee
- MySQL Database Integration
- Swagger OpenAPI Documentation
- Railway Cloud Deployment

---

## 🛠️ Technology Stack

### Backend

- Java 21
- Spring Boot 3
- Spring MVC
- Spring Data JPA
- Spring Security
- JWT Authentication

### Database

- MySQL

### Tools

- Maven
- Swagger OpenAPI
- Git
- GitHub
- Railway

---

## 📁 Project Structure

```text
src
├── main
│   ├── java
│   │   └── com.manasa.employeemanagementsystem
│   │       ├── config
│   │       ├── controller
│   │       ├── dto
│   │       ├── exception
│   │       ├── model
│   │       ├── repository
│   │       ├── security
│   │       ├── service
│   │       └── EmployeeManagementSystemApplication.java
│   └── resources
│       └── application.properties
```

## 📌 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /api/auth/register | Register User |
| POST | /api/auth/login | Login User |
| GET | /api/employees | Get All Employees |
| GET | /api/employees/{id} | Get Employee by ID |
| POST | /api/employees | Add Employee |
| PUT | /api/employees/{id} | Update Employee |
| DELETE | /api/employees/{id} | Delete Employee |

---

## ▶️ Running the Project

1. Clone the repository

```bash
git clone https://github.com/manasss-113/employee-management-system.git
```

2. Navigate to the project

```bash
cd employee-management-system
```

3. Configure MySQL in `application.properties`

4. Run the application

```bash
mvn spring-boot:run
```

5. Open Swagger UI

```
http://localhost:8080/swagger-ui/index.html
```

---

## 🚀 Deployment

This application is deployed on **Railway**.

Application:
https://employee-management-system-production-a911.up.railway.app/

Swagger:
https://employee-management-system-production-a911.up.railway.app/swagger-ui/index.html

---

## 🔮 Future Enhancements

- Role-Based Access Control
- Pagination & Sorting
- Search Employees
- Docker Support
- CI/CD Pipeline
- Unit & Integration Tests

---

## 👩‍💻 Author

**Perla Manasa**

- GitHub: https://github.com/manasss-113
