# HelpDesk

## Overview

This Ticket Management System is a full-stack application designed to manage and track tickets efficiently. It allows users to create, read, update, and delete tickets, providing a streamlined solution for handling various issues or tasks within an organization.

## Table of Contents

- [Features](#features)
- [Technology Stack](#technology-stack)
- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Project Management](#project-management)
- [Contributing](#contributing)

## Features

- **User Authentication**: Secure user registration and login.
- **Ticket Management**:
  - Create new tickets
  - View all tickets
  - Update ticket details
  - Delete tickets

## Technology Stack

- **Frontend**: React
- **Backend**: Spring Boot
- **Database**: MySQL or PostgreSQL

## Installation

### Prerequisites

- Node.js
- Java (JDK 11 or later)
- MySQL or PostgreSQL
- Maven

### Backend Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/ticket-management-system.git
   ```
2. Navigate to the backend directory:
   ```bash
   cd ticket-management-system/backend
   ```
3. Configure the database in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/ticketdb
   spring.datasource.username=yourusername
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   ```
4. Build and run the Spring Boot application:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

### Frontend Setup

1. Navigate to the frontend directory:
   ```bash
   cd ../frontend
   ```
2. Install dependencies:
   ```bash
   npm install
   ```
3. Start the React application:
   ```bash
   npm start
   ```

## Usage

1. Register a new user and log in.
2. Create, view, update, and delete tickets.

## API Endpoints

- **User Authentication**:

  - `POST /api/auth/register`: Register a new user
  - `POST /api/auth/login`: User login

- **Ticket Management**:
  - `POST /api/tickets`: Create a new ticket
  - `GET /api/tickets`: Get all tickets
  - `GET /api/tickets/{id}`: Get ticket by ID
  - `PUT /api/tickets/{id}`: Update ticket by ID
  - `DELETE /api/tickets/{id}`: Delete ticket by ID

## Project Management

This project follows agile methodologies. We use Jira for project management, task tracking, and sprint planning.

### Jira Board

- User Stories: Defined to guide development.
- Sprints: Organized in one-week intervals.
- Daily Stand-ups: Held to discuss progress and plans.

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a feature branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a pull request.
