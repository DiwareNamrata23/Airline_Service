## **✈️ Airline Management System**
A comprehensive airline management system built using **Spring Boot**, designed to manage flight schedules and ticket bookings with robust validation and RESTful APIs.

---

## **🛠️ Features**
✅ Retrieve available flight schedules.  
✅ View detailed information for specific flights.  
✅ Book a new ticket with proper validation checks.  
✅ View ticket details.  
✅ Cancel a ticket.   

---

## **📂 Project Structure**
```
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── airline
│   │   │           ├── controller
│   │   │           ├── model
│   │   │           ├── repository
│   │   │           ├── service
│   │   │           └── AirlineManagementApplication.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── data.sql
│   ├── test
│       └── (Test files for unit/integration testing)
├── .gitignore
├── README.md
└── pom.xml
```

---

## **⚙️ Tech Stack**
- **Java 17**  
- **Spring Boot 3.2.0**  
- **Spring Data JPA**  
- **H2 Database**  
- **Swagger (Springdoc)**  
- **Lombok**  

---

## **🚀 Getting Started**

### **1️⃣ Prerequisites**
Ensure you have the following installed:  
- **JDK 17** or higher  
- **Maven 3.8+**  
- IDE such as IntelliJ IDEA, VSCode, or Eclipse  

---

### **2️⃣ Installation**
Clone the repository and navigate to the project directory:  
```bash
git clone https://github.com/your-repo/airline-management-system.git
cd airline-management-system
```

---

### **3️⃣ Build the Project**
Run the following command to compile the project and resolve dependencies:  
```bash
mvn clean install
```

If you face dependency issues, use:  
```bash
mvn clean install -U
```

---

### **4️⃣ Run the Application**
Start the Spring Boot application with:  
```bash
mvn spring-boot:run
```

Expected console message:  
```
Started AirlineManagementApplication in 2.345 seconds (JVM running for 3.012)
```

---

### **5️⃣ API Endpoints**

### 📌 Flight Management
| Method   | Endpoint             | Description       | Example Request |
|----------|----------------------|-------------------|-----------------|
| `POST`   | `/flights`           | Add a new flight | `{ "airline": "Air India", "flightNumber": "AI101", "departure": "Mumbai", "destination": "Delhi", "price": 5000.00 }` |
| `GET`    | `/flights`           | Get all flights  | - |
| `GET`    | `/flights/{id}`      | Get flight by ID | `/flights/1` |
| `PUT`    | `/flights/{id}`      | Update a flight  | `{ "airline": "Air India", "flightNumber": "AI202", "departure": "Mumbai", "destination": "Chennai", "price": 5500.00 }` |
| `DELETE` | `/flights/{id}`      | Delete a flight  | `/flights/1` |

---

### 🎟️ Ticket Management
| Method   | Endpoint                  | Description       | Example Request |
|----------|---------------------------|-------------------|-----------------|
| `POST`   | `/tickets?flightId={id}`  | Book a ticket    | `{ "passengerName": "John Doe", "seatNumber": "A12" }` |
| `GET`    | `/tickets/{id}`           | Get ticket by ID | `/tickets/1` |
| `DELETE` | `/tickets/{id}`           | Cancel a ticket  | `/tickets/1` |

---

### 💡 How to Use
1. **Run MySQL** and ensure the `airline` database is set up.
2. **Start your Spring Boot application**:
   ```sh
   mvn spring-boot:run


### **6️⃣ Sample JSON Payloads**
✅ **Create Ticket Request**
```json
{
    "passengerName": "Alice Johnson",
    "email": "alice.johnson@example.com",
    "flightId": 1,
    "seatNumber": "C3",
    "status": "ACTIVE"
}
```

✅ **Flight Schedule Response**
```json
{
    "flightNumber": "AI101",
    "origin": "New York",
    "destination": "London",
    "departureTime": "2025-04-01T10:00:00",
    "arrivalTime": "2025-04-01T18:00:00",
    "status": "ON_TIME"
}
```

---

### **7️⃣ Postman for API Testing**
---

### 🛠 MySQL Configuration (application.properties)
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/airline
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA Configuration
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


---

## **🧪 Running Tests**
To execute unit and integration tests:  
```bash
mvn test
```

---

## **🐛 Troubleshooting**
❗ **Port Already in Use:**  
```bash
lsof -i :8080   # Identify process
kill -9 <PID>    # Kill conflicting process
```

❗ **Dependency Issues:**  
```bash
mvn clean install -U
```

❗ **H2 Console Errors:**  
Ensure the JDBC URL is correctly set to:  
```
jdbc:h2:mem:testdb
```

---

## **📜 License**
This project is licensed under the **MIT License**.

---
