# SmartCityCare

A desktop-based smart city management application built with **Core Java (OOP)**, **Java Swing & AWT**, **JDBC**, and **MySQL**. It gives citizens one place to file complaints, check public transport, reach emergency services, and share feedback, while administrators manage everything from a role-based admin panel.

## Features

- **Authentication and roles:** signup and login with role-based access for citizens and administrators
- **Complaint management:** citizens submit and track complaints; admins review and update status
- **Public transport tracking:** view and manage transport routes and schedules
- **Emergency services:** quick access to emergency contacts and services
- **Citizen feedback:** collect and review feedback on city services
- **City information and civic services:** browse city details and available civic services
- **User profile:** view and update personal details
- **Admin panel and dashboard:** centralized control over users, complaints, schedules, and service records
- **20+ CRUD operations** across users, complaints, transport schedules, and service records

## Tech Stack

| Layer | Technology |
| --- | --- |
| Language | Core Java (OOP) |
| UI | Java Swing, Java AWT |
| Database connectivity | JDBC |
| Database | MySQL |
| IDE | NetBeans / VS Code |
| Version control | Git, GitHub |

## Project Structure

```
SmartCityCare/
└── Smart City/
    └── Smart_city/
        ├── LoginFrame.java
        ├── SignupFrame.java
        ├── DashboardFrame.java
        ├── AdminPanelFrame.java
        ├── ComplaintFormFrame.java
        ├── TransportFrame.java
        ├── EmergencyServicesFrame.java
        ├── FeedbackFrame.java
        ├── CityInfoFrame.java
        ├── CivicServicesFrame.java
        ├── UserProfileFrame.java
        ├── data/      # application data
        ├── db/        # database files
        └── icons/     # UI icons
```

## Getting Started

### Prerequisites

- JDK 8 or later
- MySQL Server
- MySQL Connector/J (JDBC driver) added to the project classpath
- NetBeans or any Java IDE

### Setup

1. Clone the repository:
```bash
   git clone https://github.com/prathamkaware/SmartCityCare.git
```
2. Create the MySQL database and tables using the files in the `db` folder.
3. Update the database URL, username, and password in the JDBC connection code to match your local MySQL setup.
4. Add the MySQL Connector/J JAR to the project libraries.
5. Open the project in your IDE and run `LoginFrame.java`.

## Usage

1. Sign up as a new user, or log in with existing credentials.
2. Citizens can file complaints, check transport schedules, view emergency services, and submit feedback from the dashboard.
3. Administrators log in to the admin panel to manage users, complaints, schedules, and service records.


## Future Improvements

- Migrate to a Spring Boot REST backend with a React.js frontend
- Add password hashing and stronger input validation
- Add unit tests with JUnit
- Add email or SMS notifications for complaint status updates

## Author

**Pratham Kaware**
BE Information Technology, PES Modern College of Engineering, Pune
[LinkedIn](https://www.linkedin.com/in/pratham-kaware-03b563314/) | [LeetCode](https://leetcode.com/u/PRATHAMKAWARE/)
