@WebServlet("/gameHistory")
public class GameHistoryServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Fetch user's game history from the database
        UserDAO userDao = new UserDAO();
        User currentUser = (User) request.getSession().getAttribute("user");
        
        List<GameSession> gameHistory = userDao.getGameHistory(currentUser.getId());
        
        request.setAttribute("gameHistory", gameHistory);
        request.getRequestDispatcher("/gameHistory.jsp").forward(request, response);
    }
}

