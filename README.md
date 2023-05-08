# Spring Boot MongoDB Project

This is a sample Spring Boot project that demonstrates the integration of MongoDB with Java 17. The project showcases a simple "Book" class and provides CRUD (Create, Read, Update, Delete) operations for managing books using MongoDB as the data store.

## Prerequisites

Before running the project, make sure you have the following prerequisites:

- Java 17 installed
- MongoDB installed and running on your local machine or a remote server

## Getting Started

To get started with the project, follow these steps:

1. Clone the repository:
   ```
   git clone https://github.com/JoaoHenrique9/SpringMongoDb.git
   ```

2. Open the project in your favorite IDE.

3. Update the MongoDB connection details in the `application.yml` file:
   ```
     spring:
       data:
         mongodb:
           uri: 'mongodb://localhost:27017/mydatabase'
           database: mydatabase
   ```

4. Build the project using the build tool of your choice (e.g., Maven, Gradle).

5. Run the application.

## Usage

Once the application is running, you can use tools like Postman or cURL to interact with the API endpoints. Here are the available endpoints:

- `GET /api/books`: Retrieves all books.
- `GET /api/books/{id}`: Retrieves a book by its ID.
- `POST /api/books`: Creates a new book.
- `PUT /api/books/{id}`: Updates a book by its ID.
- `DELETE /api/books/{id}`: Deletes a book by its ID.

Make sure to replace `{id}` with the actual ID of the book you want to perform operations on.
