# Notes & Tasks App - Spring Boot Backend

This is the **Spring Boot backend** for the Notes & Tasks application. It provides a **RESTful API** for managing notes and tasks and can be deployed together with the React frontend using **Docker**.
The API is fully documented and testable via **Swagger UI**. 


## Features

- **Notes API**
  - Create, read, update, and delete notes  
- **Tasks API**
  - Add, update, mark as done, and delete tasks 
- **RESTful API** design  
- **DTOs & Validation** for request/response consistency  
- **Exception handling** for cleaner error responses
- **Swagger UI** for API documentation and testing 
- **JWT Authentication** for strong security  
- Dockerized for easy deployment with frontend and MySQL DB  


## Tech Stack

- **Backend:** Spring Boot  
- **Database:** MySQL
- **Security:** Spring Security + JWT
- **Documentation:** Swagger (OpenAPI)
- **Deployment:** Docker

## Setup & Run Dev enviroment Locally

1. **Clone the repository**

```bash
git clone git@github.com:STzelas/Noterr-App-Spring-Back-end.git

cd noterr-app-spring-back-end-0.2.1
```

2. Configure database
    
    Edit application.properties with your database settings and change active profile if needed.

3. Build and run the application

```
For Linux Git Bash:

./gradlew bootRun

For Windows:

gradlew bootRun
```

4. Access Swagger UI

   You can test all endpoints at:
   http://localhost:8080/swagger-ui/index.html

## Deploy using Docker

1. Download React Application

    Download the zip code of the [Notes App Front-end React application](https://github.com/STzelas/Noterr-App-React-Front-end)

2. Extract the folder to a project-root folder

    Structure should be:
    ```
    project-root/
          ├─ react-app/
          └─ spring-app/

3. in spring-app/ deploy Docker

   cd to spring-app/ and deploy the app
   ```
   C:/project-root/spring-app/~
        docker-compose up --build
   ```

4. App is ready to use!
