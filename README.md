This project demonstrates basic CRUD operations (Create, Read, Update, Delete) using JDBC with PostgreSQL in Java.
It is a console-based application intended to help understand core JDBC concepts without using any frameworks.
🛠️ Technologies Used
Java (JDK 8)
JDBC
PostgreSQL
Maven
Eclipse IDE
Git & GitHub
📂 Project Structure
Copy code

jdbc-demo
│
├── src
│   ├── main
│   │   └── java
│   │       └── com.jdbc.jdbc_demo
│   │           ├── Save.java
│   │           ├── Fetch.java
│   │           ├── Update.java
│   │           └── Delete.java
│   │
│   └── test
│       └── java
│           └── com.jdbc.jdbc_demo
│               └── AppTest.java
│
├── pom.xml
├── .gitignore
└── README.md
⚙️ Database Configuration
Database: PostgreSQL
Database Name: demo_db
Table Name: student
Sample Table
Copy code
Sql
CREATE TABLE student (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    email VARCHAR(50),
    age INT
);
🔑 JDBC Connection Details
Update the following details in your Java files if required:
Copy code
Java
String url = "jdbc:postgresql://localhost:5432/demo_db";
String user = "postgres";
String password = "root";
▶️ How to Run the Project
Clone the repository:
Copy code
Bash
git clone https://github.com/Farhankhan45/JDBC-Demo.git
Open the project in Eclipse
Ensure PostgreSQL is running
Run any of the following classes:
Save.java → Insert data
Fetch.java → Retrieve data
Update.java → Update data
Delete.java → Delete data
📘 What You Will Learn
JDBC Driver loading
Establishing database connection
Executing SQL queries
Handling ResultSet
Exception handling in JDBC
Basic Git & GitHub workflow
#Future Enhancements
Add connection pooling
Convert to Spring Boot
Add logging (Log4j / SLF4J)
Improve exception handling
👤 Author
Farhan Khan
GitHub: https://github.com/Farhankhan45
