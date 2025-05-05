# Online Job Portal

A **Spring Boot-based** job portal that allows users to search and apply for jobs, while employers can post job listings and manage applications. This project uses **Core Java, Hibernate, JDBC, and Spring Boot** to create a functional job recruitment system.

## 🚀 Features
- **User Management** – Register, log in, and apply for jobs.
- **Job Management** – Employers can create, update, and delete job postings.
- **Application Management** – Users can apply for jobs, and employers can manage applications.
- **Database Integration** – Uses **Hibernate & JDBC** for database operations.
- **REST API** – Exposes APIs for user, job, and application management.

## 🛠 Tech Stack
- **Backend:** Java, Spring Boot, Hibernate, JDBC
- **Database:** MySQL (configurable via `application.properties`)
- **ORM:** Hibernate for entity mapping
- **API Testing:** Postman

## 🔧 Setup Instructions

### 1️⃣ Clone the Repository
```sh
git clone https://github.com/chiraglokhande/online-job-portal.git
cd online-job-portal
```

### 2️⃣ Configure Database (`src/main/resources/application.properties`)
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/job_portal
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3️⃣ Run the Application
```sh
mvn spring-boot:run
```

### 4️⃣ Access API Endpoints using Postman
- `POST /users/register` – Register a user
- `POST /jobs/create` – Create a new job
- `POST /applications/apply` – Apply for a job

## 📂 Project Structure
```
📂 src/main/java/com/example/OnlineJobPortal
 ├── 📁 controller    # Handles API requests
 ├── 📁 model         # Contains entity classes (User, Job, Application)
 ├── 📁 repository    # JPA repositories for database access
 ├── 📁 service       # Business logic for jobs & applications
 ├── 📜 OnlineJobPortalApplication.java  # Main application file
```

## 📌 Future Enhancements
- 🚀 Email notifications for job applications
- 🚀 Role-based authentication (Admin, Employer, Job Seeker)
- 🚀 UI with React/Angular for frontend

## 🤝 Contributing
Feel free to submit **pull requests** and open **issues** to improve the project!

🔗 **GitHub Repo:** [(https://github.com/chiraglokhande/Online-Job-Portal)]

