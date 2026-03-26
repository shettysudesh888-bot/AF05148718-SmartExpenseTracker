# 💰 Smart Expense Tracker (Java + JDBC)

## 📖 Project Description

Smart Expense Tracker is a console-based application developed using **Java and JDBC** that helps users manage and track their daily expenses efficiently.
The system allows users to store, view, analyze, and filter expenses using a MySQL database.

---

## 🚀 Features

* ➕ Add new expense
* 📋 View all expenses
* ❌ Delete expense
* 💰 Calculate total spending
* 🔍 Filter expenses by category
* 🔄 Real-time database interaction using JDBC

---

## 🛠️ Technologies Used

* Java
* JDBC (Java Database Connectivity)
* MySQL Database
* Eclipse IDE

---

## 🗄️ Database Structure

```sql id="k8h8v1"
CREATE DATABASE expense_db;

USE expense_db;

CREATE TABLE expenses (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(50),
    amount DOUBLE,
    category VARCHAR(50),
    date DATE
);
```

---

## ▶️ How to Run

1. Install JDK and Eclipse
2. Setup MySQL database
3. Add MySQL Connector JAR to project
4. Update database credentials in `DBConnection.java`
5. Run `MainApp.java`

---

## 💡 Sample Output

1. Add Expense
2. View Expenses
3. Delete Expense
4. Total Spending
5. Filter by Category
6. Exit


📌 Example Use Case

* Track daily expenses
* Manage budget
* Analyze spending patterns
* Filter expenses by category

---

## 🎯 Learning Outcomes

* Understanding of JDBC connectivity
* Implementation of CRUD operations
* SQL queries integration with Java
* Data filtering and aggregation

---

## 👨‍💻 Author

**Sudesh S Shetty**

---

## ⭐ Future Enhancements

* Monthly expense report
* Category-wise charts
* GUI version (Swing/JavaFX)
* Export data to file

---

Linkedin:https://www.linkedin.com/in/sudesh-shetty-061838319
