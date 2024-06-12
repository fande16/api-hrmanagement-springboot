# Spring Boot CRUD API for Employee Management

This project is a Spring Boot application that provides a simple CRUD (Create, Read, Update, Delete) API for managing employees. It uses MySQL as the database and demonstrates best practices for building RESTful APIs with Spring Boot and Spring Data JPA.

## Features

- **Create**: Add new employees to the database.
- **Read**: Retrieve a list of all employees or a specific employee by ID.
- **Update**: Modify existing employee details.
- **Delete**: Remove employees from the database.

## Technologies Used

- **Spring Boot**: To build the application.
- **Spring Data JPA**: For data persistence.
- **MySQL**: As the relational database.
- **Maven**: For project management and build.

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven
- MySQL

### Setup

1. **Clone the repository:**

    ```sh
    git clone https://github.com/your_username/your_repository_name.git
    cd your_repository_name
    ```

2. **Configure the database:**

    - Create a database in MySQL.
    - Update the `src/main/resources/application.properties` file with your database configuration or set the following environment variables:
      - `MYSQL_HOST`
      - `MYSQL_PORT`
      - `MYSQL_DB`
      - `MYSQL_USER`
      - `MYSQL_PASSWORD`

3. **Build and run the application:**

    ```sh
    mvn clean install
    mvn spring-boot:run
    ```

4. **API Endpoints:**

    - `POST /api/employee` : Create a new employee
    - `GET /api/employees` : Retrieve all employees
    - `GET /api/employee/{id}` : Retrieve a specific employee by ID
    - `PUT /api/employee/{id}` : Update an employee by ID
    - `DELETE /api/employee/{id}` : Delete an employee by ID

### Example `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
