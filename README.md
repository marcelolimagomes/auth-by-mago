# Auth by MaGo

## Introduction

Hello, my name is Marcelo. Welcome to my Git repository, which I use to share my learning journey in Data Science, Machine Learning, and Artificial Intelligence. 

### I welcome suggestions!
#### I invite you to connect with me on LinkedIn:
[LinkedIn: Marcelo Lima Gomes](https://www.linkedin.com/in/marcelolimagomes)

[E-mail: marcelolimagomes@gmail.com](mailto:marcelolimagomes@gmail.com)

**Auth by MaGo** is a microservice developed by MaGo AI to manage authentication and login functionalities within a microservices architecture. Its primary goal is to provide secure and efficient user authentication across various services, ensuring a centralized solution for handling user credentials and access control.

## Features

- **Centralized Authentication:** Acts as a single point of authentication, allowing users to log in once and access multiple services without re-authenticating.

- **Token-Based Security:** Utilizes JSON Web Tokens (JWT) to securely transmit user information between services, ensuring data integrity and confidentiality.

- **Scalability:** Designed to handle a growing number of users and services, ensuring consistent performance and reliability.

- **Extensibility:** Easily integrates with additional services and supports various authentication protocols to meet evolving security requirements.

## Prerequisites

Before running the application, ensure you have the following installed:

- [Java Development Kit (JDK) 17 or later](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Apache Maven 3.6.3 or later](https://maven.apache.org/download.cgi)
- [Docker](https://docs.docker.com/get-docker/)

## Building the Application

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/marcelolimagomes/auth-by-mago.git
   cd auth-by-mago
   ```

2. **Build the Application:**

   Use Maven to build the application and create the executable JAR file:

   ```bash
   mvn clean install
   ```

   The JAR file will be located in the `target` directory.

## Running the Application

### Running Locally

To run the application locally without Docker:

1. **Start the Application:**

   ```bash
   java -jar target/auth-by-mago-0.0.1-SNAPSHOT.jar
   ```

2. **Access the Application:**

   The application will be accessible at `http://localhost:8080`.

### Running with Docker

To run the application using Docker:

1. **Build the Docker Image:**

   ```bash
   docker build -t auth-by-mago:latest .
   ```

2. **Run the Docker Container:**

   ```bash
   docker run -p 8080:8080 auth-by-mago:latest
   ```

   This command maps port 8080 of the container to port 8080 on your host machine.

## API Endpoints

The following endpoints are available:

- `POST /users/register`: Register a new user.
- `POST /login`: Authenticate a user and generate a JWT.
- `GET /users/{id}`: Retrieve user details by ID.

## Contributing

We welcome contributions to enhance the functionality and features of **Auth by MaGo**. To contribute:

1. Fork the repository.

2. Create a new branch:

   ```bash
   git checkout -b feature/your-feature-name
   ```

3. Make your changes and commit them:

   ```bash
   git commit -m "Add your feature description"
   ```

4. Push to your branch:

   ```bash
   git push origin feature/your-feature-name
   ```

5. Open a Pull Request detailing your changes.

For major changes, please open an issue first to discuss what you would like to change.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For questions or support, please contact the MaGo AI development team at [marcelolimagomes@gmail.com](mailto:marcelolimagomes@gmail.com).

---
