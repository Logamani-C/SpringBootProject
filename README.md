
 Speaking Clock Application

Overview

The Speaking Clock application converts the current system time and user-input time in HH:mm format into words. It provides endpoints to retrieve time in words using Spring Boot.

Requirements

- JDK 8 or above
- Maven (for building the project)

Getting Started

Clone the Repository

bash
git clone <repository-url>
cd <repository-directory>


Build the Project

1. Navigate to the Project Directory:
   bash
   cd <repository-directory>
   

2. Build the Project Using Maven:
   bash
   mvn clean install
   

   This command will compile the code, run tests, and package the application into a JAR file.

Run the Application

1. Run the Application Using Maven:
   bash
   mvn spring-boot:run
   

   Alternatively, you can run the JAR file directly:
   bash
   java -jar target/speaking-clock-1.0-SNAPSHOT.jar
   

2. Access the Application:
   - The application will start on `http://localhost:8080` by default.

Testing the Endpoints

1. Using Postman:
   - Current Time Endpoint:
     - Method: `GET`
     - URL: `http://localhost:8080/current-time`
   - User Input Time Endpoint:
     - Method: `GET`
     - URL: `http://localhost:8080/convert-time?time=11:25`

2. Using Swagger UI:
   - Open a web browser and navigate to `http://localhost:8080/swagger-ui.html` to interact with the API endpoints.

Error Handling

- Invalid Time Format:
  - If an invalid time format is provided, a `400 Bad Request` error with the message "Invalid time format. Please use HH:mm." will be returned.

Unit Testing

- Run Unit Tests:
  bash
  mvn test
  

  This command will execute the unit tests defined in the project and report any failures or errors.

Deployment

Docker (Optional)

If you wish to deploy the application using Docker, follow these steps:

1. Build the Docker Image:
   bash
   docker build -t speaking-clock .
   

2. Run the Docker Container:
   bash
   docker run -p 8080:8080 speaking-clock
   

   This will map port 8080 of the container to port 8080 on your host machine.

Documentation

- Swagger Documentation:
  - Available at `http://localhost:8080/swagger-ui.html` when the application is running.

Troubleshooting

- Application Fails to Start:
  - Ensure that port 8080 is not in use by another application.
  - Check the console logs for any errors during startup.

- API Not Responding:
  - Verify that the application is running and accessible at the correct URL.
