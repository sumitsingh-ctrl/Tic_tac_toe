@WebServlet("/gameSession")
public class GameSessionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Fetch game session from the user's session
        HttpSession session = request.getSession();
        Game currentGame = (Game) session.getAttribute("currentGame");
        
        // If no game session exists, start a new game
        if (currentGame == null) {
            currentGame = new Game();
            session.setAttribute("currentGame", currentGame);
        }
        
        request.setAttribute("game", currentGame);
        request.getRequestDispatcher("/game.jsp").forward(request, response);
    }
}
