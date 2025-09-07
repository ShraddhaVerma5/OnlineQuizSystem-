# OnlineQuizSystem-

📖 Introduction

The Online Quiz System is a Java-based application designed to automate and simplify the process of conducting quizzes. It provides a secure login system, timed quizzes, score calculation, and result display with correct answers. The backend uses MySQL for data storage, while Java (Swing/JavaFX) handles the user interface.

🎯 Objectives

Provide a user-friendly platform for online quizzes.

Secure user login and registration.

Fetch and randomize questions per user attempt.

Implement a countdown timer for each quiz.

Store results in the database.

Display results with correct answers for feedback.

🛠️ Tools and Technologies

Java (Swing/JavaFX) – Application logic & UI

MySQL – Database for users, quizzes, and results

JDBC (MySQL Connector/J) – Database connectivity

Eclipse/IntelliJ IDEA – IDE for development

🗄️ Database Schema

The system uses the following key tables:

Users → Stores user credentials

Quizzes → Contains quiz metadata

Questions → Stores quiz questions and options

Results → Records quiz attempts and scores

# 📘 Online Quiz System  

![Java](https://img.shields.io/badge/Java-17-red?style=for-the-badge&logo=java)  
![MySQL](https://img.shields.io/badge/MySQL-Database-blue?style=for-the-badge&logo=mysql)  
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)  
![Status](https://img.shields.io/badge/Status-Active-success?style=for-the-badge)  

---

## 📖 Introduction  
The **Online Quiz System** is a Java-based application designed to automate and simplify the process of conducting quizzes.  
It features secure user login, timed quizzes, automatic scoring, and result storage in a MySQL database.  

---

## 🎯 Objectives  
- Provide a user-friendly platform for online quizzes.  
- Secure login and registration system.  
- Randomized questions for each attempt.  
- Countdown timer to monitor attempts.  
- Store and display results with correct answers.  

---

## 🛠️ Technologies Used  
- **Java (Swing/JavaFX)** – Frontend & logic  
- **MySQL** – Database  
- **JDBC (MySQL Connector/J)** – Database connectivity  
- **Eclipse / IntelliJ IDEA** – IDE  

---

## 🗄️ Database Setup  
1. Open MySQL Command Line or Workbench.  
2. Create database using script:  
   ```sql
   CREATE DATABASE quizdb;
   USE quizdb;
   SOURCE create_db.sql;
