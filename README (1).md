# Tic Tac Toe 🎮

This is a simple **Tic Tac Toe** game developed using **Java Servlets**, **JSP**, and **Maven**. The game allows two players to play Tic Tac Toe on a web interface. It features real-time gameplay, session management, and user-friendly error handling.

## Features 🚀

- **Multiplayer Mode**: Two players can play the game in a single session.
- **Real-Time Gameplay**: The game updates immediately after each player's move.
- **Session Management**: Each game is played within a single session to keep track of player moves and the game state.
- **User-Friendly Interface**: Clean and responsive design with an easy-to-use interface.
- **Game Result**: Displays the winner or a tie at the end of the game.
- **Game Reset**: Option to restart the game after completion.

## Technologies Used 💻

- **Java**: For backend development using Servlets and JSP.
- **Servlets**: To handle user requests and game logic.
- **JSP (JavaServer Pages)**: For dynamic content rendering on the frontend.
- **Maven**: For project management and dependency management.
- **HTML5, CSS3, JavaScript/jQuery**: For frontend design and interactivity.
- **JDBC**: For database interactions to store user data or game statistics (if applicable).
- **JUnit**: For unit testing of backend logic.


## File Structure 📂
```
├── index.html
├── game.html
├── login.html
├── register.html
├── backend/
│   ├── Game.java
│   ├── GameDAO.java
│   ├── LoginServlet.java
│   ├── RegisterServlet.java
│   ├── UserServlet.java
│   └── UserDAO.java
├── style.css
├── script.js
├── web.xml
├── data.sql
└── schema.sql
```



## Getting Started 🏁

### Prerequisites

- A modern web browser (Chrome, Firefox, Safari, etc.)
- **Java Development Kit (JDK 11 or later)** installed.
- **Apache Tomcat** or any servlet container to run the backend.

### Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/tic-tac-toe.git
   cd tic-tac-toe

2. **Open the index.html file in your preferred browser:**
   
       open index.html

3. **For the backend setup:**
- Navigate to the backend directory and build the Java Servlet project.
- Use Apache Tomcat or your chosen servlet container to deploy the backend.
4. **Start using TIC TAC TOE GAME.**

## Backend Setup with Java and Servlets 💻

The backend for this project is built using **Java** with **Servlets** for server-side logic. To set up the backend:

**1. Clone the backend repository:**

   ```bash
   git clone https://github.com/your-username/tic-tac-toe-backend.git
   cd tic-tac-toe-backend
   ```

**2.** Import the project into your IDE (such as IntelliJ IDEA or Eclipse) 

**3.** The project uses **SQL** for storing user data. Set up your database and configure the connection in `web.xml` or `context.xml` depending on your environment.

**4. Deploy the application :**

   ```bash
   mvn clean install
   ```

**5.** Visit `http://localhost:8080` to test the backend functionality.

---

---
### Contributing 🤝

Contributions are welcome! Here’s how to get started:

**1.** Fork the repository.

**2.** Create a new branch: `git checkout -b feature/your-feature-name`.

**3.** Make your changes and commit them.

**4.** Push to the branch: `git push origin feature/your-feature-name`.
   5. Open a pull request with a detailed description.

   # License 📜

This project is licensed under the MIT License. See the LICENSE file for more details.



## Features

- Light/dark mode toggle
- Live previews
- Fullscreen mode
- Cross platform


## Feedback

If you have any feedback, please reach out to us at fake@fake.com

