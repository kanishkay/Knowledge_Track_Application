# KnowledgeTrack: Students' Knowledgebase 📚

**KnowledgeTrack** is a JavaFX-based academic management system designed for faculty to track, filter, and document student performance. The application supports key functionalities like whitelisting/blacklisting students, generating reports, and maintaining records persistently via a local CSV-based storage system.

---

## 🚀 Key Features

### 🕵️‍♂️ Search & Filter
- Search for student profiles by name, academic status, or skills.
- Filter through students with criteria-based search functionalities.

### 📑 Faculty Reporting
- Generate and view detailed reports on whitelisted or blacklisted students.

### 💬 Comment System
- Document faculty-student interactions with structured, date-stamped comments to maintain context and history.

### 💾 Data Persistence
- All application data is stored locally using a CSV-based flat-file architecture, ensuring your information is retained across sessions.

---

## 💻 Technologies Used

- **Language**: Java (Zulu OpenJDK 23)
- **Framework**: JavaFX
- **Build Tool**: Maven
- **Data Storage**: CSV Flat Files

---

## 🗂 Version History

### **Version 0.9**
- **Sean Reece Calantoc**: Added the student detail page with comment previews and full comment view.
- **Kanishka Yadav**: Implemented the comment functionality for student profiles and created the `StudentReportController`.
- **Hoang Khang Pham**: Enabled double-click functionality for student rows, wired data to the student info page, and implemented blacklist/whitelist functionality with demo data.
- **Cheyenne Khouri**: Built the reports page, created `ReportController`, and implemented logic to load profiles by blacklist/whitelist status.

### **Version 0.8**
- **Sean Reece Calantoc**: Added achievements/skills support, updated the edit page, and improved search filtering.
- **Kanishka Yadav**: Introduced structured comments and updates to `StudentProfile` and `DataStore`.
- **Hoang Khang Pham**: Debugged "Add Comment" features, fixed 5 student profiles, and updated language settings.
- **Cheyenne Khouri**: Created the comments page and `CommentController`, developed logic to load previous and save new comments.

### **Version 0.7**
- **Sean Reece Calantoc**: Ensured the edit page was fully functional with persistence.
- **Kanishka Yadav**: Enhanced the edit profile functionality to allow updates to academic status, job details, and preferred roles.
- **Hoang Khang Pham**: Fixed 5 profiles and ensured the display matched the edit page updates.
- **Cheyenne Khouri**: Adjusted the search page and introduced `EditController`.

---

## 🛠 Installation & Running Instructions

To set up and run KnowledgeTrack locally:

1. Install **Zulu JDK 23** and **Maven**.
2. Clone this repository:
   ```bash
   git clone https://github.com/<your-username>/KnowledgeTrack.git
   cd KnowledgeTrack
   ```
3. Build and run the application:
   ```bash
   mvn clean javafx:run
   ```

---

## 👩‍💻 Contributors

- **Sean Reece Calantoc**:
   - Focused on UI logic, comment systems, and debugging features.
- **Kanishka Yadav**:
   - Specialized in implementing comments, controllers, and structured data handling.
- **Hoang Khang Pham**:
   - Developed key student profile features and blacklist/whitelist implementations.
- **Cheyenne Khouri**:
   - Improved user interface and experience, created reporting, and enhanced search functionalities.

---

## 🏆 Achievements & Highlights

- **Real-World Applications**: KnowledgeTrack’s ability to manage and categorize student profiles is a highly valuable tool for faculty and academic institutions.
- **Built with Modularity**: Each feature was developed independently to enable easy maintenance and scalability.
- **Collaborative Development**: Successfully implemented by a team of four through clear task delegation and systematic version control.

---

## 📜 License

This project is licensed under the 

---

## 🙌 Acknowledgements

Special thanks to our team for their contributions and for making KnowledgeTrack a success. This project was created as part of a collaborative learning initiative in academic software development.
