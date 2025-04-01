# BinarySearchSpringboot

![Project Logo](IMG/logo.png)

## Overview
BinarySearchSpringboot is a lightweight Spring Boot application that demonstrates the implementation of the **binary search algorithm**. It provides a simple and efficient way to search for elements in a sorted array through a RESTful API.

## Features
- **Binary Search Implementation**: Efficient searching in a sorted array.
- **REST API**: Exposes an endpoint to perform binary search.
- **Spring Boot Integration**: Fast and lightweight application setup.

## Prerequisites
Before running this project, ensure you have:
- **Java 11 or higher**
- **Maven 3.6+**
- **Spring Boot 2.5+**

## Installation
1. **Clone the repository**:
    ```bash
    git clone https://github.com/abhay12311/BinarySearchSpringboot.git
    ```
2. **Navigate to the project directory**:
    ```bash
    cd BinarySearchSpringboot
    ```
3. **Build the project**:
    ```bash
    mvn clean install
    ```

## Usage
1. **Run the application**:
    ```bash
    mvn spring-boot:run
    ```
2. **Access the API** at `http://localhost:8080`.

## API Endpoints
### **Binary Search API**
#### **POST /search**  
Performs a binary search in a given sorted array.

**Request Body:**
```json
{
    "array": [1, 2, 3, 4, 5],
    "target": 3
}
```

**Response:**
```json
{
    "index": 2
}
```

## Project Structure
```
BinarySearchSpringboot/
├── src/
│   ├── main/
│   │   ├── java/
│   │   ├── resources/
│   └── test/
├── IMG/
│   ├── logo.png
│   ├── example.png
├── pom.xml
└── README.md
```

## Example
![Example Usage](imgs/example.png)

