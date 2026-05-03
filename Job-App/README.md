# Job Portal Web App

A simple and intuitive Job Portal web application built using **Spring Boot** and **JavaServer Pages (JSP)**. This application allows users to view a list of available job postings and add new job postings to the portal. 

## 🚀 Features
- **View All Jobs:** Browse a list of available job postings, including job profile, description, required experience, and tech stack.
- **Add a Job:** A form to submit new job postings to the portal.
- **In-Memory Storage:** Currently uses an in-memory data structure (ArrayList) to store and retrieve job data temporarily for demonstration purposes.
- **MVC Architecture:** Built following the standard Model-View-Controller design pattern using Spring MVC.

## 🛠️ Tech Stack
- **Backend:** Java 17, Spring Boot 3.x
- **Frontend:** JSP (JavaServer Pages), HTML, CSS, JSTL
- **Boilerplate Reduction:** Lombok
- **Embedded Server:** Apache Tomcat (via `tomcat-embed-jasper`)
- **Build Tool:** Maven

## 📂 Project Structure
- **Controller (`JobController.java`):** Handles all HTTP requests, maps them to views, and coordinates with the service layer.
- **Service (`JobService.java`):** Contains the business logic of the application.
- **Repository (`JobRepo.java`):** Manages data storage and retrieval. Currently pre-populated with some dummy job postings.
- **Model (`JobPost.java`):** The core data entity representing a job posting.
- **Views (`*.jsp` files):** The frontend UI components used to render the web pages.

## 🔗 Endpoints / Routes
| Route | Method | Description |
|---|---|---|
| `/` or `/home` | GET | Displays the home page of the application. |
| `/addjob` | GET | Renders the form to create a new job posting. |
| `/handleForm` | POST | Submits the form data and adds the job to the repository, redirecting to a success page. |
| `/viewalljobs` | GET | Fetches and displays a list of all current job postings. |

## 💻 How to Run the Application Locally

### Prerequisites
- [Java Development Kit (JDK) 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) or higher
- [Maven](https://maven.apache.org/download.cgi) installed (or use the provided Maven wrapper)
- An IDE like IntelliJ IDEA, Eclipse, or VS Code

### Steps to Run
1. **Clone the repository** (if applicable) or navigate to the project root directory (`Job-App`):
   ```bash
   cd "Job-App"
   ```

2. **Build the project** using Maven:
   ```bash
   mvn clean install
   ```

3. **Run the Spring Boot application**:
   ```bash
   mvn spring-boot:run
   ```
   *Alternatively, run the main `JobAppApplication.java` class directly from your IDE.*

4. **Access the application** in your web browser:
   - Open [http://localhost:8080/](http://localhost:8080/) to view the home page.

## 🔮 Future Enhancements
- Integrate a real database (like PostgreSQL or MySQL) using Spring Data JPA.
- Add user authentication and authorization (Admin vs. User roles).
- Implement search and filtering functionalities for job listings.
- Enhance the UI/UX with modern CSS frameworks like Bootstrap or Tailwind CSS.
