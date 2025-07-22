# FitnessApp

[![Language: Java](https://img.shields.io/badge/Language-Java-blue.svg)](https://www.oracle.com/java/)
[![Framework: Spring Boot](https://img.shields.io/badge/Framework-Spring%20Boot-green.svg)](https://spring.io/projects/spring-boot)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![Last Commit](https://img.shields.io/github/last-commit/ManiraM-1/FitnessApp.svg)](https://github.com/ManiraM-1/FitnessApp/commits/master)
[![Open Issues](https://img.shields.io/github/issues/ManiraM-1/FitnessApp.svg)](https://github.com/ManiraM-1/FitnessApp/issues)
[![Stars](https://img.shields.io/github/stars/ManiraM-1/FitnessApp.svg)](https://github.com/ManiraM-1/FitnessApp/stargazers)

---

## Overview

FitnessApp is a Spring Boot microservices-based application designed to manage user fitness data through scalable and modular architecture. It includes user, activity, and AI-powered services, along with centralized configuration, API gateway, and service discovery.

---

## Table of Contents

1. [Features](#features)  
2. [Architecture & Structure](#architecture--structure)  
3. [Installation](#installation)  
4. [Usage](#usage)  
5. [Configuration](#configuration)  
6. [Technologies Used](#technologies-used)  
7. [Contributing](#contributing)  
8. [License](#license)

---

## Features

- Microservice modules: **userService**, **activityService**, **aiService**
- Central configuration via **configServer**
- API routing and aggregation through **gateway**
- Service discovery with **Eureka**
- AI-based analytics through **aiService**
- Scalable, independent deployment for each service

---

## Architecture & Structure

```
FitnessApp/
├── configServer/         # Centralized configuration service
├── eureka/               # Eureka discovery server
├── gateway/              # API gateway (Spring Cloud Gateway)
├── userService/          # User management microservice
├── activityService/      # Fitness activity microservice
├── aiService/            # AI analytics microservice
└── fitness-app-frontend/ # Frontend client (if applicable)
```

---

## Installation

### Prerequisites

- Java 11+
- Maven 3.6+
- Docker & Docker Compose (optional)
- Node.js/NPM (if frontend exists)

```bash
# Clone
git clone https://github.com/ManiraM-1/FitnessApp.git
cd FitnessApp

# Build all services
mvn clean install
```

---

## Usage

### Running with Docker Compose (recommended)
*(Assuming `docker-compose.yml` is configured)*

```bash
docker-compose up --build
```

### Running Locally

Start services in this order:

```bash
java -jar configServer/target/configServer.jar
java -jar eureka/target/eureka.jar
java -jar gateway/target/gateway.jar
java -jar userService/target/userService.jar
java -jar activityService/target/activityService.jar
java -jar aiService/target/aiService.jar
```

Frontend (if applicable):

```bash
cd fitness-app-frontend
npm install
npm start
```

---

## Configuration

- **configServer**: Provides centralized config via YAML/properties files.
- **ports**:
  - Config Server: `8888`
  - Eureka: `8761`
  - Gateway: `8080`
  - userService: `8081`
  - activityService: `8082`
  - aiService: `8083`

Update configuration in `configServer/src/main/resources/` for endpoint URLs, DB credentials, API keys, etc.

---

## Technologies Used

[![Java](https://img.shields.io/badge/Java-11%2B-blue.svg)]()
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7.x-green.svg)]()
[![Spring Cloud](https://img.shields.io/badge/Spring%20Cloud-2021.0.x-brightgreen.svg)]()
[![Eureka](https://img.shields.io/badge/Service%20Discovery-Eureka-orange.svg)]()
[![Gateway](https://img.shields.io/badge/API%20Gateway-Spring%20Cloud%20Gateway-lightgrey.svg)]()
[![Maven](https://img.shields.io/badge/Build-Maven-red.svg)]()
[![AI Service](https://img.shields.io/badge/AI-Service-gray.svg)]()
[![Docker](https://img.shields.io/badge/Containerized-Docker-blue.svg)]()

---

## Contributing

Contributions are welcome. To contribute:

1. Fork the repository  
2. Create a feature branch (`feature/XYZ`)  
3. Commit changes with meaningful messages  
4. Push the branch and open a pull request

Please adhere to coding conventions and include tests for new functionality.

---

## License

This project is licensed under the **MIT License**. See [LICENSE](LICENSE) for details.