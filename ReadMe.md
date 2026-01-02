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

- **Kanishka Yadav**:
   - Built the **structured comment system**, enabling faculty to log and review feedback alongside updates to `StudentProfile` and `DataStore`.
   - Developed the **StudentReportController** and improved the handling of profile data to streamline reporting.
   - Enhanced the **Edit Profile functionality**, allowing updates to academic status, work details, and roles for tailored student management.
   - Contributed core features for the **Search Profiles Page**, including `SearchProfileController` and `TableView` integration for efficient profile searches.

- **Sean Reece Calantoc**:
   - Designed the **Profile Page UI**, including navigation buttons and validation controls, ensuring users could intuitively interact with the application.
   - Implemented the **comment system**, including previews and full comment views for organized recording of feedback.
   - Enhanced the **Edit Profile functionality** to save changes persistently and debugged key features like the "Save" button.
   - Added support for **achievements and skills**, while improving search filters for a smoother user experience.

- **Hoang Khang Pham**:
   - Implemented **student profile management**, including double-click functionality, data population, and profile linking.
   - Engineered **CSV-based data storage**, enabling persistent saving and retrieval of profile data and associated information.
   - Debugged and reworked the **Add Comment feature**, fixing display bugs and ensuring smooth operation.
   - Built the **search page**, adding fields for filtering, navigation buttons, and logic for quick and intuitive data retrieval.

- **Cheyenne Khouri**:
   - Designed and implemented the **reporting system**, including the reports page and `ReportController`, filtering by blacklist/whitelist status.
   - Played a key role in **UI/UX improvements**, reorganizing tables, sorting profiles alphabetically, and refining layouts for better usability.
   - Created the **functional comments page**, allowing users to load, review, and save comment entries persistently.
   - Developed **navigation components and search functionalities**, making profile exploration seamless and efficient.

---

## 🏆 Achievements & Highlights

- **Real-World Applications**: KnowledgeTrack’s ability to manage and categorize student profiles is a highly valuable tool for faculty and academic institutions.
- **Built with Modularity**: Each feature was developed independently to enable easy maintenance and scalability.
- **Collaborative Development**: Successfully implemented by a team of four through clear task delegation and systematic version control.

---

## 📜 License

This project is licensed under the Apache License 2.0

---

## 🙌 Acknowledgements

Special thanks to our team for their contributions and for making KnowledgeTrack a success. This project was created as part of a collaborative learning initiative in academic software development.
