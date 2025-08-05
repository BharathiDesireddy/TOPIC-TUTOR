
# 🎯 Topic Tutor Using AI

A smart AI-powered platform that helps users learn topics like **Pointers in C++** with video explanations and challenging quizzes.

---

## 🚀 Features
- 🔍 Topic-based learning modules
- 🤖 AI-generated explanation videos
- 🧠 Dynamic quizzes (Easy, Medium, Hard)
- 🗃️ Backend API using Spring Boot
- 💾 MySQL Database integration

---

## 🛠️ Tech Stack

| Layer        | Technology          |
|--------------|---------------------|
| Backend      | Java, Spring Boot   |
| Database     | MySQL               |
| API Testing  | Postman             |
| Project Build| Maven               |

---

## 🧪 How to Run

### Prerequisites:
- Java 17+
- MySQL running locally
- Maven installed
- Postman (for testing APIs)

### Steps:
```bash
# Clone the repo
git clone https://github.com/BharathiDesireddy/TOPIC-TUTOR.git

# Go into the project
cd TOPIC-TUTOR

# Update DB credentials in src/main/resources/application.properties

# Start the project
mvn spring-boot:run


# Topic Tutor Using AI - Phase 2

Phase 2 of the **Topic Tutor Using AI** project focuses on building the **frontend in React** and integrating it with the **Spring Boot backend**, enabling users to search for any topic and get **real-time YouTube video explanations**.

---

## ✅ Key Features Implemented in Phase 2

### 1. 🎯 Search by Topic
- Users can enter any topic into a **search bar**.
- Upon clicking **"Generate Explanation"**, the system fetches relevant videos.

### 2. 🎥 YouTube API Integration
- Integrated the **YouTube Data API v3** to fetch **real video links** based on the user's topic.
- Videos are dynamically fetched and shown to the user as **clickable YouTube links**.

### 3. 🧼 Clean UI
- The frontend now only shows the **searched topic’s result**.
- All previously tested or saved topics are **hidden**.
- The UI consists of:
  - Search bar
  - Generate button
  - List of YouTube links (after search)

### 4. 🔗 Backend API Connection
- React frontend connects to Spring Boot backend via REST APIs.
- `/topics/{id}/explanation` now returns **actual YouTube video links**.

---

## 🏗️ Tech Stack

| Layer     | Technology        |
|-----------|-------------------|
| Frontend  | React (create-react-app) |
| Backend   | Java, Spring Boot |
| API       | YouTube Data API v3 |
| Build Tool | Maven            |

---




