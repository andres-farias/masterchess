package cl.azulprofundo.masterchess.web;

import cl.azulprofundo.masterchess.gameplay.GameStarter;
import cl.azulprofundo.masterchess.model.board.BoardState;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/play")
public class ChessMasterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        BoardState startingBoard = GameStarter.getStartingBoard();
        PrintWriter writer = resp.getWriter();
        writer.println(startingBoard.toString());
    }
}
