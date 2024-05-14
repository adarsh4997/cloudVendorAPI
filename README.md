# Spring Boot RESTful API Demo

This project is a demonstration of building a simple RESTful API with CRUD (Create, Read, Update, Delete) operations using Spring Boot.

## Project Structure

The project consists of the following components:

- **Controller:** The `CloudVendorAPIService` class defines the REST endpoints for managing cloud vendors. It handles HTTP requests for retrieving, creating, updating, and deleting cloud vendor details.
  
- **Model:** The `CloudVendor` class represents the model for a cloud vendor entity. It contains fields such as vendor ID, name, address, and phone number, along with getter and setter methods.

- **Main Class:** This class serves as the entry point of the Spring Boot application.

## Endpoints

- **GET /cloudvendor/{vendorId}**: Retrieve details of a cloud vendor by providing the vendor ID.
  
- **POST /cloudvendor**: Create a new cloud vendor by providing JSON data in the request body.
  
- **PUT /cloudvendor**: Update an existing cloud vendor by providing JSON data in the request body.
  
- **DELETE /cloudvendor**: Delete the cloud vendor details.

## Usage

To run the application locally, you can follow these steps:

1. Clone the repository to your local machine.
  
2. Open the project in your preferred IDE (e.g., Spring Tool Suite).
  
3. Run the application as a Spring Boot application.
  
4. Use a tool like Postman or curl to send requests to the defined endpoints and interact with the API.

## Dependencies

The project uses the following dependencies:

- Spring Boot Starter Web: For building RESTful APIs.
  
- Spring Boot DevTools: For automatic application restarts during development.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.

