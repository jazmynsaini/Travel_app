# 🧳 Travel Booking System (Java Swing + MySQL)

A desktop-based Java Swing application for booking travel packages. This project uses Java, Swing for the GUI, and MySQL for the backend database.

---

## 📌 Project Summary

This application allows users to:
- Book travel packages
- View existing bookings
- Store data securely in a MySQL database
- Navigate a clean and responsive GUI

This project was developed to fulfill the requirements of a **GUI-based project marking rubric**, including modular code structure, JDBC connectivity, and intuitive UI.

---

## 💻 Tech Stack

- Java (JDK 8+)
- Swing (UI)
- JDBC (Java Database Connectivity)
- MySQL
- VS Code or IntelliJ IDEA
- MySQL Connector/J

---

## 📁 Project Structure
TRAVEL_APP/
├── src/
│ ├── main/ # Main launcher
│ │ └── Main.java
│ ├── model/ # Data models (Booking)
│ │ └── Booking.java
│ ├── util/ # DB utility class
│ │ └── DatabaseConnection.java
│ ├── dao/ # Data Access Layer
│ │ └── BookingDAO.java
│ └── view/ # GUI components
│ ├── MainMenu.java
│ ├── BookingForm.java
│ └── ViewBookings.java
├── README.md
└── travel_app.sql
