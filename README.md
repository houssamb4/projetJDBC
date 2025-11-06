# projetJDBC

projetJDBC is a Java project that demonstrates basic CRUD (Create, Read, Update, Delete) operations on a `Client` entity using **JDBC** (Java Database Connectivity) and a relational database.

---

## Project Overview

This project allows managing clients in a database. It includes a `ClientService` class implementing CRUD operations, connecting to the database using JDBC through a `Connexion` class. 

The project structure separates the **entities**, **services**, and **DAO interfaces**, following a clean layered architecture.

---

## Features

- Add new clients to the database
- Update existing clients
- Delete clients (to be implemented)
- Retrieve a client by ID
- List all clients
- JDBC database connectivity

---

## Technologies Used

- Java (JDK 8 or higher)
- JDBC for database connectivity
- MySQL 
- IDE: IntelliJ

---

## Database Setup

1. Create a database (e.g., `projetjdbc`) in your database server.
2. Create a `client` table:

```sql
CREATE TABLE client (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(50) NOT NULL,
    prenom VARCHAR(50) NOT NULL,
    telephone VARCHAR(20),
    email VARCHAR(50)
);
