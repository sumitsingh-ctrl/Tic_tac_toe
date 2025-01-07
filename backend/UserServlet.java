package com.servlet;

import com.dao.UserDAO;
import com.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class UserServlet extends HttpServlet {

    private UserDAO userDAO;

    @Override
    public void init() throws ServletException {
        super.init();
        userDAO = new UserDAO(); // Create instance of DAO
    }

    // Handling GET requests (Login Form)
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("register".equals(action)) {
            // Redirect to the registration page
            request.getRequestDispatcher("/register.jsp").forward(request, response);
        } else {
            // Display the login form
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

    // Handling POST requests (Form submission)
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Check credentials
        if (userDAO.isValidUser(username, password)) {
            // If valid, forward to the game page
            response.sendRedirect("game.jsp");
        } else {
            // Invalid credentials, redirect back to login
            request.setAttribute("error", "Invalid username or password");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }
}
