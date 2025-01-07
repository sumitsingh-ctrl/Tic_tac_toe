@WebServlet("/gameResult")
public class GameResultServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Game currentGame = (Game) session.getAttribute("currentGame");
        
        // Check game result and update in the database
        String winner = currentGame.getWinner(); // Get winner (X or O)
        GameDAO gameDao = new GameDAO();
        gameDao.saveGameResult(currentGame, winner);
        
        // Set result and forward to result page
        request.setAttribute("result", winner);
        request.getRequestDispatcher("/gameResult.jsp").forward(request, response);
    }
}

